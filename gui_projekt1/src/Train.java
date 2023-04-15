import Exceptions.MaxNumberOfRailcarsExceededException;
import Exceptions.MaxWeightExceededException;
import Railcars.Railcar;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private static int globalId;
    private int id;
    private String name;

    private boolean onLine = false;
    private List<Railcar> railcars;

    private RailwayStation currentStation;

    //ilość dołączonych wagonów
    private int quantity;
    //maksymalna ilość wagonów
    private int maxQuantity;

    //maksymalny udzwig
    private int maxWeight;

    //aktualna masa
    private int weight;

    //max wagony elektyczne
    private int maxElectricalRailcars;

    //ilość wagonów elektrycznych
    private int electricalRailcarsCounter;

    //prędkość bazowa
    private int baseSpeed;

    //predkosc aktualna
    private int speed;

    public Train(String name, int maxQuantity, int maxWeight, int maxElectricalRailcars) {
        id = globalId;
        globalId++;
        this.railcars = new ArrayList<>();
        this.maxQuantity = maxQuantity;
        this.maxWeight = maxWeight;
        this.maxElectricalRailcars = maxElectricalRailcars;
    }

    public void addRailcar(Railcar railcar) {
        if(quantity == maxQuantity)
            throw new MaxNumberOfRailcarsExceededException();

        if(weight + railcar.getWeight() > maxWeight)
            throw new MaxWeightExceededException();

        quantity++;
        weight += railcar.getWeight();
        this.railcars.add(railcar);
    }

    public void setOnLine(boolean onLine){
        this.onLine = onLine;
    }

    public boolean isOnLine()
    {
        return onLine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RailwayStation getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(RailwayStation currentStation) {
        this.currentStation = currentStation;
    }

    @Override
    public String toString() {
        String ret = "Name:" + name + " Id:" + id + " Current Railway Station:" + (currentStation != null ? currentStation.toString() : "none") + " Base Speed:" + baseSpeed + " Speed:" + speed + " Railcars quantity:" + quantity + " Max railcars quantity:" + maxQuantity + " Weight:" + weight + " Max Weight" + maxWeight + " Electrical railcars quantity:" + electricalRailcarsCounter + " Max electrical railcars quantity:" + maxElectricalRailcars + "\nConnected Railcars:\n{";
        for (Railcar r:railcars)
            ret += "\n" + r.toString();
        ret += "\n}";
        return ret;
    }

}