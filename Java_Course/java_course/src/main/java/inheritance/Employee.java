package inheritance;

public class Employee extends Person {
    private String employeeID;
    private String title;

    // if there is NO default constructor but there is a parameterized constructor, no 'ghost' constructor is made in the parent class and an error will be thrown
    // ie. if Person(){} constructor is removed from person.java but Person(String name){} is kept, the below will not work unless super("SomeName") is run.
    public Employee(){
        super(); // calls constructor matching parameter list.
//         super("Doug"); // calls constructor that matches parameter in parent class.
        System.out.println("In employee default constructor!");
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
