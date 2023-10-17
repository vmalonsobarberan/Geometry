public class Main3 {
    public static void main(String[] args) {
        Segment seg = new Segment(new Point(4,5), new Point(6,8));
        seg.setOffset(4, 4);
        System.out.println(seg + " Module: " + seg.getModule());
    }
}
