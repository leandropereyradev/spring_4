package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(FruitAddException.class)
    public ResponseEntity<String> handleFruitAddException(FruitAddException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }

    @ExceptionHandler(FruitDeleteException.class)
    public ResponseEntity<String> handleFruitDeleteException(FruitDeleteException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }

    @ExceptionHandler(FruitUpdateException.class)
    public ResponseEntity<String> handleFruitUpdateException(FruitUpdateException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }

    @ExceptionHandler(FruitGetAllException.class)
    public ResponseEntity<String> handleFruitGetAllException(FruitGetAllException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }

    @ExceptionHandler(FruitServiceException.class)
    public ResponseEntity<String> handleFruitNotFoundException(FruitServiceException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred: " + e.getMessage());
    }
}
