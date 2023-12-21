package abstraction;

public abstract class Shape {

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public void print(){
        System.out.println("I am a shape.");
    }
}
