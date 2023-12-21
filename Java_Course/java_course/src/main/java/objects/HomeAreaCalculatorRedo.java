package objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        The calculator is required to 'set up state'. unclear on why this might be the case.

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();

        double totalArea = calculator.calculateAreaOfRoom(room1, room2);

        System.out.println("Area of both rooms: " + totalArea);
//        room1.setLength(50);
//        room1.setWidth(25);
//        double areaOfRoom1 = room1.calculateArea();
//        System.out.println("Area of room1: " + areaOfRoom1);
//
//        Rectangle room2 = new Rectangle(40, 55);
//        double areaOfRoom2 = room2.calculateArea();
//        System.out.println("Area of room2: " + areaOfRoom2);


    }

    public Rectangle getRoom(){
        System.out.println("Enter the length of the room:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateAreaOfRoom(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }
}
