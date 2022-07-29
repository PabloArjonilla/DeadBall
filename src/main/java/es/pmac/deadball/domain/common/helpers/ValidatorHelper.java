package es.pmac.deadball.domain.common.helpers;

import es.pmac.deadball.domain.common.exceptions.DomainException;

import java.util.ResourceBundle;
import java.util.UUID;

public class ValidatorHelper {
    static ResourceBundle resourceBundle;

    public static void validateNonNull(Object object, String attribute) {
        if (object == null) {
            throw new DomainException(String.format(getResourceBundle().getString("domain.nonNull"), attribute));
        }
    }

    public static void validateNonBlank(String value, String attribute) {

        validateNonNull(value, attribute);

        if (value.isBlank()) {
            throw new DomainException(String.format(getResourceBundle().getString("domain.nonBlank"), attribute));
        }
    }

    public static void validUUID(UUID uuid, String attribute) {

        validateNonNull(uuid, attribute);

        if (!uuid.toString().matches("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}")) {
            throw new DomainException(String.format(getResourceBundle().getString("domain.validID"), attribute));
        }
    }

    public static ResourceBundle getResourceBundle() {
        if (resourceBundle == null) {
            resourceBundle = ResourceBundle.getBundle("exceptions");
        }
        return resourceBundle;
    }
}
