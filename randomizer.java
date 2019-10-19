import java.lang.Math;

public class randomizer{
  public static void main (String [] args){
    double rand = Math.random() * 1000;
    int num = (int)rand;
    System.out.println(num);
  }
}