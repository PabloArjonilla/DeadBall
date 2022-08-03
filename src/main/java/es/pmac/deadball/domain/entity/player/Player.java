package es.pmac.deadball.domain.entity.player;

import es.pmac.deadball.domain.common.exceptions.DomainException;
import es.pmac.deadball.domain.common.helpers.ValidatorHelper;
import es.pmac.deadball.domain.entity.Uuid;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@Builder(toBuilder = true)
public class Player {

    private Uuid uuid;
    private String name;

    private Player(Uuid uuid, String name) {
        this.uuid = uuid;
        this.name = name;
        Validate();
    }

    private void Validate() {

        List<Exception> exceptions = new ArrayList<>();

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
