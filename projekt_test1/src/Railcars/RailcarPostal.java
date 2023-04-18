package Railcars;

public class RailcarPostal extends Railcar{

    private int parcelsAmount;
    private int maxParcels;
    private int weightNetto;
    private int weightBrutto;

    public RailcarPostal(int weight, int parcelsAmount,  int maxParcels, int weightNetto, int weightBrutto ) {

        super(RailcarType.POSTAL, weight);
        this.parcelsAmount = parcelsAmount;
        this.weightNetto = weightNetto;
        this.weightBrutto = weightBrutto;
        this.maxParcels = maxParcels;

    }

}
