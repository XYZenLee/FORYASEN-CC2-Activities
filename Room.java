import java.io.*;
import java.lang.NumberFormatException;
import java.text.DecimalFormat;

public class Room {
  public static void main(String[] args){
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    DecimalFormat df  = new DecimalFormat("#,##0.00");
    String lIn="";
    String wIn="";
    double length = 0;
    double width  = 0;
    
    System.out.print("Enter length: ");
    try{
      lIn = in.readLine();
      length = Double.parseDouble(lIn);
    }catch(NumberFormatException | IOException e){
      System.out.println("Invalid Input");
      return;
    }
    
    System.out.print("Enter width: ");
    try{
      wIn = in.readLine();
      width = Double.parseDouble(wIn);
    }catch(NumberFormatException | IOException e){
      System.out.println("Invalid Input");
      return;
    } 
    
    double area = length*width;
    
    System.out.println("The floor space of the room is "+df.format(area)+" square units.");
    
  }
}
