public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(8, 3);
        Segment segment = new Segment(p1, p2);
        System.out.println(segment.getModule());
        System.out.println(segment);
        segment.setOffset(3, 1);
        System.out.println(segment);
        segment.setEndPoint(new Point(1,1));
        System.out.println(segment);
    }
}
