package Railcars;

public class RailcarPorterPostal extends Railcar{

    private int parcelsAmount;
    private int maxParcels;
    private int packageAmount;
    private int maxPackage;
    private int weightNetto;
    private int weightBrutto;

    public RailcarPorterPostal(int weight, int parcelsAmount, int maxParcels, int packageAmount, int maxPackage, int weightNetto, int weightBrutto){
        super(RailcarType.PORTERPOSTAL, weight);
        this.parcelsAmount = parcelsAmount;
        this.maxParcels = maxParcels;
        this.packageAmount = packageAmount;
        this.maxPackage = maxPackage;
        this.weightNetto = weightNetto;
        this.weightBrutto = weightBrutto;

    }

}
