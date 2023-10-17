public class Main4 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(4, 4);
        Point[] points = {p1, p2, p3, p4};

        Point[] points2 = {new Point(1,1), new Point(2,2)};

        Polygon pol = new Polygon(points);
        Polygon pol2 = new Polygon(p1, p2, p3);
        System.out.println(pol);
    }
}
