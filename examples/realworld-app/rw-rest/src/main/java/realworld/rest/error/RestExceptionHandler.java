package realworld.rest.error;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import realworld.entity.exception.ResourceAlreadyExistsException;
import realworld.entity.exception.ResourceNotFoundException;

import java.io.IOException;
import java.util.List;

@ControllerAdvice
public class RestExceptionHandler
        extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value
            = { IOException.class})
    protected ResponseEntity<Object> handleIo(
            RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, new RestError(List.of("Connection Error with the Database")),
                new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    @ExceptionHandler(value
            = { ResourceAlreadyExistsException.class})
    protected ResponseEntity<Object> handleConflict(
            RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, new RestError(List.of(ex.getLocalizedMessage())),
                new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

    @ExceptionHandler(value
            = { ResourceNotFoundException.class})
    protected ResponseEntity<Object> handleNotFound(
            RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, new RestError(List.of(ex.getLocalizedMessage())),
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
