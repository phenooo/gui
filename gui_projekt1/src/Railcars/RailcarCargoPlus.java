package Railcars;

public class RailcarCargoPlus extends Railcar {

    private int maxAvailableSpace;
    private int currentUsedSpace;
    private int maxGoodsWeight;
    private int currentGoodsWeight;
    private int additionalCompartments;


public RailcarCargoPlus(int weight, int maxAvailableSpace, int currentUsedSpace, int maxGoodsWeight, int currentGoodsWeight, int additionalCompartments){
    super(RailcarType.CARGOPLUS, weight);
    this.maxAvailableSpace = maxAvailableSpace;
    this.currentUsedSpace = currentUsedSpace;
    this.maxGoodsWeight = maxGoodsWeight;
    this.currentGoodsWeight = currentGoodsWeight;
    this.additionalCompartments = additionalCompartments;
}


}
