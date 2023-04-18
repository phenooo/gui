package Railcars;

public class RailcarGasTank extends RailcarCargo{

    boolean ventilationOn = true;

    public RailcarGasTank(int weight, int maxAvailableSpace, int currentUsedSpace, int maxGoodsWeight, int currentGoodsWeight){
        super(RailcarType.GASTANK, weight,maxAvailableSpace,currentUsedSpace,maxGoodsWeight,currentGoodsWeight);
    }
}
