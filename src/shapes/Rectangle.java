package shapes;

public class Rectangle extends BaseShape {

Rectangle(double width, double height) {
    this.height = height;
    this.width = width;
}
    @Override
    public double getHeight() {
        return this.setHeight();
    }

    @Override
    public double setHeight() {
    return this.height;
    }

    @Override
    public double setWidth() {
        return this.width;

    }

    @Override
    public double getWidth() {
        return this.setWidth();
    }



    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2*(getWidth() + getHeight());
    }

    @Override
    public boolean isEqualShape() {
        return false;
    }


}
