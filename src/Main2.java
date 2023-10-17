public class Main2 {
    public static void main(String[] args) {
        Point p1 = new Point(4,5);
        Point p2 = new Point(6,8);
        p1.setOffset(4, 4);
        p2.setOffset(4, 4);
        System.out.println(p1.toString());
        System.out.println(p2);
    }
}
