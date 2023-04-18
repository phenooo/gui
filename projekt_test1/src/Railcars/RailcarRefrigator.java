package Railcars;

public class RailcarRefrigator extends RailcarCargo {

    private double shippingTemperature;

    public RailcarRefrigator(int weight, int maxAvailableSpace, int currentUsedSpace, int maxGoodsWeight, int currentGoodsWeight, double shippingTemperature){
        super(RailcarType.REFRIGATOR, weight,maxAvailableSpace,currentUsedSpace,maxGoodsWeight,currentGoodsWeight);
        this.shippingTemperature = shippingTemperature;
    }
}
