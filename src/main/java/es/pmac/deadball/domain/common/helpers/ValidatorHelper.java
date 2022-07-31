package es.pmac.deadball.domain.common.helpers;

import es.pmac.deadball.domain.common.exceptions.DomainException;

import java.util.ResourceBundle;

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


    public static ResourceBundle getResourceBundle() {
        if (resourceBundle == null) {
            resourceBundle = ResourceBundle.getBundle("exceptions");
        }
        return resourceBundle;
    }
}
