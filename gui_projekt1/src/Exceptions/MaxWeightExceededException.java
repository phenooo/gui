package Exceptions;

public class MaxWeightExceededException extends RuntimeException {

    public MaxWeightExceededException(){}

    public MaxWeightExceededException(String message){
        super(message);
    }

}
