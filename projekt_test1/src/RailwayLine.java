import Exceptions.RailwayLinePartNotFound;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

//public class RailwayLine {
//    private String id;
//    private ArrayList<RailwayLinePart> parts = new ArrayList<>();
//
//    private RailwayStation start;
//    private RailwayStation end;
//
//    public RailwayLine(String id) {
//        this.id = id;
//    }
//
//    public void addRailwayLinePart(RailwayStation start, RailwayStation end, double length) {
//        parts.add(new RailwayLinePart(start, end, length,false));
//    }
//
//    public RailwayStation getNextStation(RailwayLinePart current){
//        for(RailwayLinePart rlp : parts)
//        {
//            if(current == rlp)
//            {
//                return rlp.getEnd();
//            }
//        }
//        throw new RailwayLinePartNotFound();
//    }
//}
