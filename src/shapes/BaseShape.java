package shapes;

public class BaseShape {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.getHeight() * this.getWidth();
    }

    public double getCircumference() {
        return 2 * (this.getWidth() + this.getHeight());
    }

}