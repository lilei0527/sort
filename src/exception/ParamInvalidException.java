package exception;

public class ParamInvalidException extends RuntimeException{
    public ParamInvalidException(String message) {
        super(message);
    }
}
