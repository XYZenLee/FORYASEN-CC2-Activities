import java.util.*;

public class Airplane{
  String seats[]={"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"};

  public void reserve(int row, int col){
    int chair = ((row-1)*6+col)-1;
    if(seats[chair].equals("X")){
      System.out.println("Seat taken.Please choose another seat number!");
    }
    else{
      seats[chair]="X";
    }
  }
  
  public void display(){
  System.out.print("\n\n");
  for (int k=0;k<78;k++){
    System.out.print("        ");
    System.out.print(seats[k]);
    if((k+1)%6==0){
      System.out.print("\n\n");
    }
   }
  }
  
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    Airplane o = new Airplane();
    int ro=0,co,type=0;
    String again="Y";
    o.display();
    
    do{
      do{
        System.out.println("Enter Ticket Type:\n[1]First Class\n[2]Business\n[3]Economy");
        type=in.nextInt();
        if(type==1){
          do{
          System.out.println("Enter row[1-3]:");
          ro=in.nextInt();
          if(ro<1||ro>3){System.out.println("Seat does not belong to ticket type. Please try again.");}
          }while(ro<1||ro>3);
        }
        else if(type==2){
          do{
          System.out.println("Enter row[4-8]:");
          ro=in.nextInt();
          if(ro<4||ro>8){System.out.println("Seat does not belong to ticket type. Please try again.");}
          }while(ro<4||ro>8);
        }
        else if(type==3){
          do{
          System.out.println("Enter row[9-13]:");
          ro=in.nextInt();
          if(ro<9||ro>13){System.out.println("Seat does not belong to ticket type. Please try again.");}
          }while(ro<9||ro>13);
        }
        else{
          System.out.println("Invalid Input.\nPlease input again.\n");
        }
      }while(type<1 || type>3);
      do{
        System.out.println("Enter column[1-6]");
        co=in.nextInt();
        if(co<1||co>6){System.out.println("Seat does not exist. Please input again.");}
      }while(co<1||co>6);
      o.reserve(ro,co);
      o.display();
      do{
        System.out.println("Do you want to try again?");
        again = in.next();
        if(!again.equals("Y")&&!again.equals("N")){System.out.println("Invalid Input.\nPlease input again.\n");}
        System.out.println("\n");
      }while(!again.equals("Y")&&!again.equals("N"));
    }while(again.equals("Y"));
      System.out.println("Thank you for flying with us\nHave a nice day!");
    
  }
}
//1-3 4-8 9-13