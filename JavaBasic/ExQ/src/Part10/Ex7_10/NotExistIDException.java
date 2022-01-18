package Part10.Ex7_10;

public class NotExistIDException extends Exception{
    public NotExistIDException() {};
    public NotExistIDException(String message) {
        super(message);
    }
}
