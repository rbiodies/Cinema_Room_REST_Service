package cinema;

public class BusinessException extends Exception {
    public BusinessException(String error) {
        super(error);
    }
}