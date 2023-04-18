package Railcars;

public class RailcarLiquidTank extends RailcarCargo{

    boolean isProtected = true;

    public RailcarLiquidTank(int weight, int maxAvailableSpace, int currentUsedSpace, int maxGoodsWeight, int currentGoodsWeight){
        super(RailcarType.LIQUIDTANK, weight,maxAvailableSpace,currentUsedSpace,maxGoodsWeight,currentGoodsWeight);
    }
}
