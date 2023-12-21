package abstraction;

public class ShapeTester {
    public static void main(String[] args) {
//        Shape rect1 = new Rectangle(5, 10);
//        System.out.println(rect1.calculateArea());
//        rect1.print();

        Shape square = new Square(4, 5);
        System.out.println(square.calculateArea());
        square.print();
        System.out.println(square.calculatePerimeter());
    }
}
