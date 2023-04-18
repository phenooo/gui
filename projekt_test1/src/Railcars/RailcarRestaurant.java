package Railcars;

public class RailcarRestaurant extends Railcar{

    private int numberOfSeats;
    private int numberOfEmployees;
    private int numberOfTables;
   //boolean isOpen;


    public RailcarRestaurant(int weight, int numberOfSeats, int numberOfEmployees, int numberOfTables){
        super(RailcarType.RESTAURANT, weight);
        this.numberOfSeats = numberOfSeats;
        this.numberOfEmployees = numberOfEmployees;
        this.numberOfTables = numberOfTables;
        //this.isOpen = isOpen;
    }

}
