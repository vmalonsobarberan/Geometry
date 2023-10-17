public class Polygon {
    private Point[] points;

    public Polygon(Point... points) {
        this.points = points;
    }

    public Polygon() {
        points = null;
    }

    @Override
    public String toString() {
        String s = "";
        for (Point point : points) {
            s += point + " - ";
        }
        s += points[0];
        return s;
    }
}
