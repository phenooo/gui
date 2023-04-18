package Railcars;

public class RailcarExplosives extends RailcarCargoPlus{

    boolean isBulletProof = true;
    boolean isProtected = true;

    public RailcarExplosives(int weight, int maxAvailableSpace, int currentUsedSpace, int maxGoodsWeight, int currentGoodsWeight, int additionalCompartments){
        super(RailcarType.EXPLOSIVES, weight,maxAvailableSpace,currentUsedSpace,maxGoodsWeight,currentGoodsWeight,additionalCompartments);
    }
}
