package shapes;

public class DisplayShape {

    public static void main(String[] args) {
        BaseShape baseShape;

        Square sq1 = new Square();

        baseShape = sq1;

        baseShape.setHeight(5);
        baseShape.setWidth(10);

        System.out.println(sq1.getArea());
        System.out.println(sq1.getWidth());
        System.out.println(sq1.getHeight());
    }
}
