package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n02.S04T02N02PereyraGastonLeandro.exceptions;

public class FruitServiceException extends RuntimeException {
    public FruitServiceException(String message) {
        super(message);
    }

    public FruitServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
