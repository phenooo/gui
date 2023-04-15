package Railcars;

public class RailcarRefrigator extends RailcarCargo {

    private double currentTemperature;

    public RailcarRefrigator(int weight, int maxAvailableSpace, int maxGoodsWeight){
        super(RailcarType.REFRIGATOR, weight, maxAvailableSpace, maxGoodsWeight);
    }
}
