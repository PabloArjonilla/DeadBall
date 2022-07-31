package es.pmac.deadball.domain.entity;

import es.pmac.deadball.domain.common.exceptions.DomainException;
import es.pmac.deadball.domain.common.helpers.ValidatorHelper;
import lombok.Getter;

import java.util.UUID;

@Getter
public class Uuid {

    private final String value;

    public Uuid(String value) {
        if (value == null) {
            this.value = UUID.randomUUID().toString();
        } else {
            validate(value);
            this.value = value;
        }
    }

    public static void validate(String id) {
        ValidatorHelper.validateNonNull(id, "id");

        if (!id.matches("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}")) {
            throw new DomainException(String.format(ValidatorHelper.getResourceBundle().getString("domain.validID"), "id"));
        }
    }
}
