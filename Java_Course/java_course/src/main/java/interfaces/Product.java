package interfaces;

public interface Product {

    String getName();
    void setName(String name);

    // adding these to active code generates errors downstream from the interface unless they are updated.
    // default methods: to avoid breaking all classes implementing the interface to ensure backward compatibility.
    // sometimes it is better to break the subclasses - such as in price, defaulting to 0 is possibly worse than
    // having things break.
    default double getPrice(){
        return 0;
    }
//    void setPrice(double price);

    public static String staticMethod(){
        return "Help";
    }

}
