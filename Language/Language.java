class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
    Language(String languageName, int speakers, String regions, String order) {
      this.name = languageName;
      this.numSpeakers = speakers;
      this.regionsSpoken = regions;
      this.wordOrder = order;
    }
  
    public void getInfo() {
      System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The language follows the word order: " + wordOrder);
    }
  
    public static void main(String[] args){
      Language italian = new Language("Italian", 800000, "the Italian Peninsula", "subject-verb-object");
      italian.getInfo();
      Language maya1 = new Mayan("Mayan", 40000);
      maya1.getInfo();
  
      SinoTibetan MandarinChinese = new SinoTibetan("Mandarin Chinese", 100000);
      SinoTibetan Burmese = new SinoTibetan("Burmese", 13000);
  
      MandarinChinese.getInfo();
      Burmese.getInfo();
    }
  }