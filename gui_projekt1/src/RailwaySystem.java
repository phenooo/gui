import java.util.ArrayList;
import java.util.List;

public class RailwaySystem {
    private ArrayList<Train> trains;
    private ArrayList<RailwayStation> stations;
    private ArrayList<RailwayLine> lines;

    public RailwaySystem() {
        this.trains = new ArrayList<>();
        this.stations = new ArrayList<>();
        this.lines = new ArrayList<>();
    }

    public void addTrain(Train train) {
        this.trains.add(train);
    }

    public void addStation(RailwayStation station) {
        this.stations.add(station);
    }

    public void addLine(RailwayLine line) {
        this.lines.add(line);
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
}


