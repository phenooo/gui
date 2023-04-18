package Railcars;

public class RailcarCargo extends Railcar{

    private int maxAvailableSpace;
    private int currentUsedSpace;
    private int maxGoodsWeight;
    private int currentGoodsWeight;

//    public RailcarCargo (int weight, int maxAvailableSpace, int maxGoodsWeight){
//        super(RailcarType.CARGO, weight);
//        this.maxAvailableSpace = maxAvailableSpace;
//        this.maxGoodsWeight = maxGoodsWeight;
//    }

    public RailcarCargo (RailcarType type, int weight, int maxAvailableSpace, int currentUsedSpace, int maxGoodsWeight, int currentGoodsWeight){
        super(RailcarType.CARGO, weight);
        this.maxAvailableSpace = maxAvailableSpace;
        this.currentUsedSpace = currentUsedSpace;
        this.maxGoodsWeight = maxGoodsWeight;
        this.currentGoodsWeight = currentGoodsWeight;
    }


}
