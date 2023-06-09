package exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends Exception {

    public RecordNotFoundException() { super(); }

    public RecordNotFoundException(String message) { super(message); }

    public RecordNotFoundException(Throwable throwable) { super(throwable); }

    public RecordNotFoundException(String message, Throwable throwable) { super(message, throwable); }
}
