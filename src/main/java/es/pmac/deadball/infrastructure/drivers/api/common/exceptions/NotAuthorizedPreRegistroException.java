package es.pmac.deadball.infrastructure.drivers.api.common.exceptions;

//TODO redo
public class NotAuthorizedPreRegistroException extends RuntimeException {

    //TODO Obtener textos de resourcebundle
    public NotAuthorizedPreRegistroException() {
        super("Formato invalido");
    }

    public NotAuthorizedPreRegistroException(String message) {
        super(message);
    }

    public NotAuthorizedPreRegistroException(String message, Throwable e) {
        super(message, e);
    }
}
