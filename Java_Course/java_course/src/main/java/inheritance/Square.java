package inheritance;

import objects.Rectangle;

public class Square extends Rectangle {
//    Note imports Rectangle above.
    @Override // tells Java/other programmers that this method is inherited and being overridden.
    public double calculatePerimeter(){
//        return sides * length; // doesn't work at first - private variables! have to change from private -> protected in parent class.
        return getSides() * getLength();
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
