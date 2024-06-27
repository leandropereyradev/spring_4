package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.exceptions;

public class FruitServiceException extends RuntimeException {
    public FruitServiceException(String message) {
        super(message);
    }

    public FruitServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
