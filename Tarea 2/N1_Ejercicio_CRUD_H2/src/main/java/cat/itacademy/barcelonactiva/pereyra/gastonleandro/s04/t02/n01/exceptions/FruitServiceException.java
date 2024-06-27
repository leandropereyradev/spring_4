package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n01.exceptions;

public class FruitServiceException extends RuntimeException {
    public FruitServiceException(String message) {
        super(message);
    }

    public FruitServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
