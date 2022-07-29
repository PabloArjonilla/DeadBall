package es.pmac.deadball.domain.player;

import es.pmac.deadball.domain.common.exceptions.DomainException;
import es.pmac.deadball.domain.common.helpers.ValidatorHelper;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
public class Player {

    private UUID id;
    private String name;

    private Player(UUID id, String name) {
        this.id = id;
        this.name = name;
        Validate();
    }

    private void Validate() {

        List<Exception> exceptions = new ArrayList<>();

        try {
            ValidatorHelper.validUUID(this.id, "id");
        } catch (DomainException e) {
            exceptions.add(e);
        }

        try {
            ValidatorHelper.validateNonBlank(this.name, "name");
        } catch (DomainException e) {
            exceptions.add(e);
        }


        if (!exceptions.isEmpty()) {
            StringBuilder errorMessages = new StringBuilder();
            exceptions.forEach(exception -> errorMessages.append(exception.getMessage() + " "));
            throw new DomainException(String.format(ValidatorHelper.getResourceBundle().getString("exceptions.validDomain"), "Player", errorMessages));
        }

    }
}
