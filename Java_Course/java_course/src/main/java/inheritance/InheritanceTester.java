package inheritance;

import objects.Rectangle;

public class InheritanceTester {
 /* important note on constructors -
 constructors in superclasses execute BEFORE the constructors in subclasses.
 Overloading - methods with same name, diff parameter lists.
 Subclasses can overload methods that are inherited from a superclass.
 e.g. Person has someMethod(int a), Employee can have someMethod(int a, String b)
 Distinct from override, which has the same signature as the overridden method.
 See Rectangle.java / Square.java

 Constructors are not inherited by child classes.
 Public/Protected members are inherited.
 Private are not.
 Final methods can be inherited but NOT overridden.

 Methods cannot be made stricter when being overridden. Public cannot become protected.
 It can go the other way - protected can be public.

 Sealed class - can define classes that can only be inherited by some other classes.
 Format public sealed class SomeClass permits SomeChild, SomeOtherChild {}
 child must be exist and extend parent class.
 Children of sealed classes have to be sealed, non-sealed, or final.
 eg.. public sealed class SomeChild extends SomeClass permits SomeThirdChild {}
 or
 public non-sealed class SomeChild extends SomeClass {}
 or
 public final class SomeChild extends SomeClass {} <- SomeChild cannot be inherited from in this example.


 */

    public static void main(String[] args) {
//        Person person = new Person();
//        Employee employee = new Employee();
//        Temp temp = new Temp();

        Square square = new Square();
        square.setLength(40);
        System.out.println(square.calculatePerimeter());

        Rectangle rect = new Rectangle();
        rect.print();
        Square squa = new Square();
        squa.print("Square of course");
    }
}
