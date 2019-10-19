

public class VariablesAndDataTypes{
  public static void main(String[]args){
    String headline ="The temprature in Baguio City has warmed throughout the years.";
    char firstLetter = 'A';
    float tempDawn = 16;
    double tempNoon = 23.5;
    byte hours = 24;
    short days = 7;
    int weeks = 4;
    long months = 12;
    boolean condition = 1>2;
    
    if (condition==true){
      System.out.println(headline);
      System.out.println("\t" + firstLetter + " recent news stated that the City has been averaging " + tempDawn + " degrees celsius at dawn and " + tempNoon + " at noon."); 
      System.out.println("\t\tRegardless, lowlanders still feel cold " + hours +" hours a day, " +days+ " days a week, " +weeks+ " weeks per month and " +months+ " months each year."); 
      }
    else{
      System.out.println("The boolean was changed to a False value");
      }
  }
}