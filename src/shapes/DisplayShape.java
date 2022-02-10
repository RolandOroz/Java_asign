package shapes;

public class DisplayShape {

    public static void main(String[] args) {
        BaseShape baseShape;

        Square sq1 = new Square(5);

        System.out.println(Square.class);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getWidth());
        System.out.println(sq1.getHeight());
        System.out.println(sq1.getCircumference());

        Rectangle rect1 = new Rectangle();
        baseShape = rect1;

        baseShape.setHeight(5);
        baseShape.setWidth(10);

        System.out.println(Rectangle.class);
        System.out.println(rect1.getArea());
        System.out.println(rect1.getWidth());
        System.out.println(rect1.getHeight());
        System.out.println(rect1.getCircumference());

    }
}