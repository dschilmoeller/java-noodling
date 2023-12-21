package polymorphism;

public class PolymorphismTester {

    public static void main(String[] args) {
        Dog rocko = new Dog();
        Animal sasha = new Dog();

//        rocko.makeSound();
//        rocko.fetch();

//        sasha.makeSound();
//        sasha.fetch();
//        This doesn't work. Because Animal does not have fetch(). But...sasha is a Dog().

        /*
        This is because sasha here has been IMPLICITLY upcast.
        Her type is therefore Animal and thus does not have access to fetch.
        To make it work she would have to be EXPLICITLY downcast
        Despite this the method is from the subclass, not the animal class.
         */

//        ((Dog)sasha).fetch();
        /*
        This temporarily casts sasha as a dog, giving her access to the fetch method.
        Below we can change her to a cat, have her make a sound, and then briefly allow her to scratch. This does not
        permanently alter sasha.
         */

        /*
        Note sasha is instantiated above, and changed to a cat here.
         */

        sasha = new Cat();
//        sasha.makeSound();
//        ((Cat)sasha).scratch();
//        sasha.scratch(); // this still throws an error.
        /*
        To permanently change, a new object would be needed.
         */

//        Cat sashaTheCat = (Cat)sasha;
//        sashaTheCat.scratch();

//        Animal brutus = new Dog();
//        Cat brutusTheCat = (Cat)brutus; // this throws an error because 'siblings' are NOT a thing.

        /*
        Casting is generally very dangerous and shouldn't be done lightly.
         */

        /*
        instanceof Operator:
        Checks to see whether class is true/false.
         */

//        boolean isRockoAnimal = rocko instanceof Animal; // True
//        boolean isRockoDog = rocko instanceof Dog; // True
//        boolean isRockoCat = rocko instanceof Cat; // Error

        feed(rocko);
        feed(sasha);
    }
    /*
        instanceof testing.
     */
        public static void feed(Animal animal){
            if(animal instanceof Dog){
                System.out.println("Here's some dog food");
            } else if(animal instanceof Cat){
                System.out.println("Here's some kitty kibble");
            } else{
                System.out.println("I think that's a tiger. Run.");
            }
        }

    /*
    instanceof Pattern Matching
    The below is functionally identical to:
    if (animal instanceof [Subclass]) {
        [Subclass] newVar = [Subclass]animal;
        newVar.action;
    }
     */
    public static void trick(Animal animal){
        if(animal instanceof Dog newAnimal){
            newAnimal.fetch();
        } else if (animal instanceof Cat newAnimal) {
            newAnimal.scratch();
        }
    }


}
