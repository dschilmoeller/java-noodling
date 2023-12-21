package abstraction;

public abstract class Rectangle extends Shape {
    /*
    Note error is thrown until a calculateArea() method is created.
     */

    private double length;
    private double width;

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter(){
        return (length*2) + (width*2);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
