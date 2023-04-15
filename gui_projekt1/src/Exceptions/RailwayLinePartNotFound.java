package Exceptions;

public class RailwayLinePartNotFound extends RuntimeException {
    public RailwayLinePartNotFound(){}

    public RailwayLinePartNotFound(String message){
        super(message);
    }
}
