import java.util.*;

public class Time {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int min = 0;
    System.out.print("Enter number of minutes: ");
    try{
      min = in.nextInt();
    }catch(InputMismatchException e){
      System.out.println("Invalid Input");
      return;
    }
    if ((min/60)<2){
      if((min%60)==0){
    	System.out.println(min + " minutes is "+min/60+" hour");
      }
      else if ((min%60)==1){
        System.out.println(min + " minutes is "+min/60+" hour and "+min%60+" minute.");
      }
      else{
        System.out.println(min + " minutes is "+min/60+" hour and "+min%60+" minutes.");
      }
    }else{
	  if((min%60)==0){
    	System.out.println(min + " minutes is "+min/60+" hours");
      }
      else if ((min%60)==1){
        System.out.println(min + " minutes is "+min/60+" hours and "+min%60+" minute.");
      }
      else{
        System.out.println(min + " minutes is "+min/60+" hours and "+min%60+" minutes.");
      }    
    }
  }
}
