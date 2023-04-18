import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class RailwayStation {

    private ArrayList<RailwayStation> connectedStations = new ArrayList<>();
    public RailwayStation(String name, int x, int y)
    {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    private String name;
    private int x, y;

    public void addRailwayStation(RailwayStation railwayStation){
        connectedStations.add(railwayStation);
    }

    public static double getDistanceBetweenStations(RailwayStation rs1, RailwayStation rs2){
        double distance = Math.sqrt((rs2.x - rs1.x) * (rs2.x - rs1.x) + (rs2.y - rs1.y) * (rs2.y - rs1.y));
        return distance;
    }

    public static String getRailwayLine(RailwayStation rs, String destinationName){
        HashMap<String, Boolean> visited = new HashMap<>();

        return getRailwayLine(rs, visited, destinationName);
    }

    private static String getRailwayLine(RailwayStation current, HashMap<String, Boolean> visited, String destinationName) {

        System.out.println("Visiting " + current.name + " " + visited.keySet());

        String ret = "";

        for(RailwayStation rs : current.connectedStations)
        {
//            if(!visited.containsKey(current.name))
//            {
                if(!visited.containsKey(current.name))
                    visited.put(current.name, true);

                if (current.name.equals(destinationName))
                    ret = current.name;
          //  }
        }
        return ret;
    }

    @Override
    public String toString(){
        return "Railway station name = " + name;
    }
}