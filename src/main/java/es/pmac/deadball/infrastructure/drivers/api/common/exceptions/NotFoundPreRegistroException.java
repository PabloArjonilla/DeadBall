package es.pmac.deadball.infrastructure.drivers.api.common.exceptions;

//TODO redo
public class NotFoundPreRegistroException extends RuntimeException {

    //TODO Obtener textos de resourcebundle
    //TODO Genérico apiexception?? da igual la entidad
    public NotFoundPreRegistroException() {
        super("Oferta no encontrada");
    }

    public NotFoundPreRegistroException(String message) {
        super(message);
    }

    public NotFoundPreRegistroException(String message, Throwable e) {
        super(message, e);
    }
}
