
// Array Notes
import java.util.ArrayList;

class Arrays {

  public static void detection() {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Print the size of each ArrayList below:
    System.out.println(sherlocksToDos.size());
    System.out.println(poirotsToDos.size());
    System.out.println(sherlocksToDos.get(2));
    sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
    poirotsToDos.set(3, "listen to Captain Hastings for amusement");
    sherlocksToDos.remove(0);
    sherlocksToDos.remove(0);
    poirotsToDos.remove(0);
    System.out.println(sherlocksToDos.indexOf("solve the case"));
      
    // Print the name of the detective with the larger to-do list:
    System.out.println("Poirot");

  
}

  public static void main(String[] args) {
    
    // Create toDoList below:
  ArrayList<String> toDoList = new ArrayList<String>();

  String toDo1 = "Water plants";
  // Add more to-dos here:
  String toDo2 = "Pick up garage";
  String toDo3 = "Overwater plants";
  
  // Add to-dos to toDoList
  toDoList.add(toDo1);
  toDoList.add(toDo2);
  toDoList.add(toDo3);
  
  System.out.println(toDoList);
  }

}