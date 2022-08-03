package es.pmac.deadball.infrastructure.drivers.api.common.exceptions;

//TODO redo
public class InternalErrorPreRegistroException extends RuntimeException {

    //TODO Obtener textos de resourcebundle
    public InternalErrorPreRegistroException() {
        super("Internal error");
    }

    public InternalErrorPreRegistroException(String message) {
        super(message);
    }

    public InternalErrorPreRegistroException(String message, Throwable e) {
        super(message, e);
    }
}
