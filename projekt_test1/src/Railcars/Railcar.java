package Railcars;

public abstract class Railcar {
    private static int globalId;
    protected int id;
    protected int weight;
    protected RailcarType type;

    protected boolean isOnline = false;

    public Railcar(RailcarType type, int weight) {
        id = globalId;
        globalId++;
        this.weight = weight;
        this.type = type;
    }

    public int getWeight(){
        return weight;
    }

    public RailcarType getRailcarType() {return type;}

    @Override
    public String toString() {
        String ret = "Railcar type: " + type + " Id: " + id;
        return ret;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}


