package shapes;

public abstract class BaseShape {
    protected double width;
    protected double height;


    public abstract double getHeight();
    public abstract double setHeight();
    public abstract double getWidth();
    public abstract double setWidth();
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean isEqualShape();
}
