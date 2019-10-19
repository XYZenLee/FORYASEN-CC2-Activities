import java.lang.Math;

public class CC2_Lab5{
  public static void main (String [] args){
    double rand = Math.random() * 1000;
    int messageCount = (int)rand;
    float charge;
    
    if (messageCount<=200){
      charge = 0f;
      System.out.println("You have sent "+messageCount+" messsages.");
      System.out.println("You have incurred "+charge+" PHP in charges.");
    }else{
      charge = (messageCount-200)*0.5f;
      System.out.println("You have sent "+messageCount+" messsages.");
      System.out.println("You have incurred "+charge+" PHP in charges.");
    }
  }
}