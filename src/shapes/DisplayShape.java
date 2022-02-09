package shapes;

public class DisplayShape {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square.getClass());
        System.out.println(square.getArea());
        System.out.println(square.getWidth());
        System.out.println(square.getHeight());
        System.out.println(square.getPerimeter());

        Rectangle rectangle = new Rectangle(10,5);

        System.out.println(rectangle.getClass());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.isEqualShape());


    }
}
