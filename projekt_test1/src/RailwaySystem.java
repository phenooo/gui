import Railcars.Railcar;

import java.util.ArrayList;
import java.util.List;

public class RailwaySystem {
    private ArrayList<Train> trains;
    private ArrayList<RailwayStation> stations;
    //private ArrayList<RailwayLine> lines;
    private ArrayList<Railcar> railcars;

    public RailwaySystem() {
        this.trains = new ArrayList<>();
        this.stations = new ArrayList<>();
        this.railcars = new ArrayList<>();

        RailwayStation rs1 = new RailwayStation("Bydgoszcz", 20, 0);
        RailwayStation rs2 = new RailwayStation("Toruń", 47, 13);
        RailwayStation rs3 = new RailwayStation("Olsztyn", 85, 6);
        RailwayStation rs4 = new RailwayStation("Krakowa", 15, 20);

        rs1.addRailwayStation(rs2);

        rs2.addRailwayStation(rs4);
        rs2.addRailwayStation(rs3);

        rs2.addRailwayStation(rs1);

        System.out.println(RailwayStation.getRailwayLine(rs1, "Olsztyn"));

    }

    public void addTrain(Train train) {
        this.trains.add(train);
    }

    public void addStation(RailwayStation station) {
        this.stations.add(station);
    }

    //public void addLine(RailwayLine line) {
    //    this.lines.add(line);
    //}

    public void addRailcar(Railcar railcar) {
        this.railcars.add(railcar);
    }

    public void run() {
        // code to run the simulation
    }

    public ArrayList<Train> getAllTrains() {
        return trains;
    }

    public ArrayList<Train> getAllAvailableTrains() {
        ArrayList<Train> trains = new ArrayList<>();

        for (Train t : this.trains)
        {
            if(!t.isOnLine())
                trains.add(t);
        }

        return trains;
    }

    public ArrayList<Railcar> getAllRailcars()
    {
        return railcars;
    }

    public ArrayList<Railcar> getAllAvailableRailcars(){
        ArrayList<Railcar> railcars = new ArrayList<>();

        for (Railcar r : this.railcars)
        {
            if(!r.isOnline())
                railcars.add(r);
        }

        return railcars;
    }
}


