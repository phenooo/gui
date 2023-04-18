package Railcars;

public class RailcarPassenger extends Railcar {

    private int numberOfSeats;
    private boolean isFirstClass ;
    private boolean isCompartmentCar ;
    private boolean isSleeper ;

    public RailcarPassenger(int weight, int numberOfSeats, boolean isFirstClass, boolean isCompartmentCar, boolean isSleeper) {

        super(RailcarType.PASSENGER, weight);
        this.numberOfSeats = numberOfSeats;
        this.isFirstClass = isFirstClass;
        this.isCompartmentCar = isCompartmentCar;
        this.isSleeper = isSleeper;

    }

    public RailcarPassenger(int weight, int numberOfSeats) {

        super(RailcarType.PASSENGER, weight);
        this.numberOfSeats = numberOfSeats;


    }
}
