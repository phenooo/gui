package Railcars;

public class RailcarToxicMaterials extends RailcarCargoPlus{
    boolean ventilationOn= true;
    boolean isProtected = true;

    public RailcarToxicMaterials(int weight, int maxAvailableSpace, int currentUsedSpace, int maxGoodsWeight, int currentGoodsWeight, int additionalCompartments){
        super(RailcarType.TOXICMATERIALS, weight,maxAvailableSpace,currentUsedSpace,maxGoodsWeight,currentGoodsWeight,additionalCompartments);
    }
}
