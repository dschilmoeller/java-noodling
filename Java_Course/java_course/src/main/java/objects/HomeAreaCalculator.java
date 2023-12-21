package objects;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("Area of room1: " + areaOfRoom1);

        Rectangle room2 = new Rectangle(40, 55);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("Area of room2: " + areaOfRoom2);
    }
}
