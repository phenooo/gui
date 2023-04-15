import Railcars.Railcar;

public class RailwayLinePart {
    private RailwayStation start;
    private RailwayStation end;

    private boolean occupied = false;

    public RailwayLinePart(RailwayStation start, RailwayStation end, boolean occupied) {
        this.start = start;
        this.end = end;
        this.occupied = occupied;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public RailwayStation getStart() {
        return start;
    }

    public RailwayStation getEnd() {
        return end;
    }
}
