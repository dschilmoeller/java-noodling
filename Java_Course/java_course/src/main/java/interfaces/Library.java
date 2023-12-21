package interfaces;

public class Library {

    public static void main(String[] args) {
//        Product book1 = new Product(); // doesn't work.
//        Book book1 = new Product(); // doesn't work
        Product book1 = new Book(); // works!
        Book book2 = new Book(); // Also works. Probably works slightly differently.

        book1.setName("The Count of Monte Cristo");
        System.out.println(book1.getName());

//        book1.staticMethod(); // this doesn't work!
        System.out.println(Product.staticMethod()); // example of a static method being implemented for some damn reason.
//        note doesn't require instantiation (indeed, cannot be) - called directly from the interface.

    }
}
