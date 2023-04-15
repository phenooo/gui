package Exceptions;

public class MaxNumberOfRailcarsExceededException extends RuntimeException {

    public MaxNumberOfRailcarsExceededException(){}

    public MaxNumberOfRailcarsExceededException(String message)
    {
        super(message);
    }
}
