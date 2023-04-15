package Railcars;

public abstract class Railcar {
    private static int globalId;
    protected int id;
    protected int weight;
    protected RailcarType type;

    public Railcar(RailcarType type, int weight) {
        id = globalId;
        globalId++;
        this.weight = weight;
        this.type = type;
    }

    public int getWeight(){
        return weight;
    }
}
