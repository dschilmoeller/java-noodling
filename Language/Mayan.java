class Mayan extends Language {
  Mayan(String name, int speakers){
    super(name, speakers, "Central America", "verb-object-subject");
  }

  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + regionsSpoken + ". The language follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + " is an ergative language.");
  }
}