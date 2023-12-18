import java.util.Scanner;
import java.util.Objects;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MedievalGame {

  /* Instance Variables */
  Player player = new Player("Dave");

  /* Main Method */
  public static void main(String[] args) {
    
    Scanner console = new Scanner(System.in);
    MedievalGame game = new MedievalGame();

    game.player = game.start(console);

    game.addDelay(500);
    System.out.println("\nLet's take a quick look at you to make sure you're ready to head out the door.");
    System.out.println(game.player);

    game.addDelay(1000);
    System.out.println("\nWell, you're off to a good start, let's get your game saved so we don't lose it.");
    game.save();

    game.addDelay(2000);
    System.out.println("We just saved your game...");
    System.out.println("Now we are going to try to load your character to make sure the save worked...");

    game.addDelay(1000);
    System.out.println("Deleting character...");
    String charName = game.player.getName();
    game.player = null;

    game.addDelay(1500);
    game.player = game.load(charName, console);
    System.out.println("Loading character...");

    game.addDelay(2000);
    System.out.println("Now let's print out your character again to make sure everything loaded:");

    game.addDelay(500);
    System.out.println(game.player);
  } // End of main

  /* Instance Methods */
  private Player start(Scanner console) {
    // Add start functionality here
    Player player;
    Art.homeScreen();
    System.out.println("Welcome to your latest adventure!");
    System.out.println("Tell me traveler, have you been here before?");
    System.out.print("   Enter 'y' to load a game, 'n' to create a new game: ");
    String answer = console.next().toLowerCase();
    while (true) {
      addDelay(500);
      if (answer.equals("y")) {
        System.out.println("\nI thought as much. What was your name again?");
        player = load(console.next(), console);
        break;
      } else if (answer.equals("n")) {
        System.out.print("\nWell then, what are you called?");
        String possibleName = console.next();
        while (true) {
          System.out.println("Welcome " + possibleName + ", am I pronouncing that correctly? (Enter 'y' to confirm, 'n' to enter a new name");
          String nameResponse = console.next().toLowerCase();
          if (Objects.equals(nameResponse, "y")) break;
          System.out.println("So sorry, can you spell it for me again?");
          possibleName = console.next();
        }
        player = new Player(possibleName);
        break;
      } else {
        System.out.print("Sorry adventurer, I didn't quite catch that. Please enter y to load or n to start a new game:");
        answer = console.next().toLowerCase();
      }
    }
    return player;
  } // End of start

  private void save() {
    // Add save functionality here
    String fileName = player.getName() + ".svr";
    try {
      FileOutputStream userSaveFile = new FileOutputStream(fileName);
      ObjectOutputStream playerSaver = new ObjectOutputStream(userSaveFile);
      playerSaver.writeObject(this.player);
      playerSaver.close();
    } catch (IOException e) {
      System.out.println("Error saving game inside catch block: " + e);
    }
    
  } // End of save

  private Player load(String playerName, Scanner console) {
    // Add load functionality here
    Player loadedPlayer;
    try {
      FileInputStream userSaveFile = new FileInputStream(playerName + ".svr");
      ObjectInputStream playerLoader = new ObjectInputStream(userSaveFile);
      loadedPlayer = (Player) playerLoader.readObject();
      playerLoader.close();
    } catch (IOException | ClassNotFoundException e){
      addDelay(1500);
      System.out.println("searching...");
      addDelay(2000);
      System.out.println("Player not found. Creating new player.");
      addDelay(2000);
      loadedPlayer = new Player(playerName);
    }


    return loadedPlayer;
  } // End of load

  // Adds a delay to the console so it seems like the computer is "thinking"
  // or "responding" like a human, not instantly like a computer.
  private void addDelay(int time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}