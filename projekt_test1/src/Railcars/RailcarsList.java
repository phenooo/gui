package Railcars;

import java.util.ArrayList;

public class RailcarsList {
    private static ArrayList<Railcar> railcars = new ArrayList<>();
    static int count = 0;

    public RailcarsList(){}

    public void addRailcars(Railcar railcar){
        railcars.add(railcar);
        count++;
    }
}


