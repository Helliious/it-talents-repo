package bri4ki.exceptions;

public class BadRequestException extends RuntimeException{

    public BadRequestException(String msg){
        super(msg);
    }
}
