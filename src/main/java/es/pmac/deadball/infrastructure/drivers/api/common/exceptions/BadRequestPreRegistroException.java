package es.pmac.deadball.infrastructure.drivers.api.common.exceptions;

public class BadRequestPreRegistroException extends RuntimeException {

    public BadRequestPreRegistroException() {
        super("Formato invalido");
    }

    public BadRequestPreRegistroException(String message) {
        super(message);
    }

    public BadRequestPreRegistroException(String message, Throwable e) {
        super(message, e);
    }
}
