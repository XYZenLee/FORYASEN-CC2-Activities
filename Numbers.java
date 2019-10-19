import java.util.*;

public class Numbers{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int aDig=0, bDig=0, cDig=0, dDig=0, eDig=0, fDig=0;
    int num, tens,ones;
    String ac,bc,cc,dc,ec,fc;
    
    System.out.print("Please input 6 digits[0~9]: ");
    String input = in.nextLine();
    if(input.length()==11){
      ac = ""+input.charAt(0);
      bc = ""+input.charAt(2);
      cc = ""+input.charAt(4);
      dc = ""+input.charAt(6);
      ec = ""+input.charAt(8);
      fc = ""+input.charAt(10);
      
      try{
        aDig = Integer.parseInt(ac);
        bDig = Integer.parseInt(bc);
        cDig = Integer.parseInt(cc);
        dDig = Integer.parseInt(dc);
        eDig = Integer.parseInt(ec);
        fDig = Integer.parseInt(fc);
      }catch(InputMismatchException e){
        System.out.print("Invalid Input.");
      }
      
      if(aDig>=0 && aDig<=9 && bDig>=0 && bDig<=9 && cDig>=0 && cDig<=9 &&
         dDig>=0 && dDig<=9 && eDig>=0 && eDig<=9 && fDig>=0 && fDig<=9){
        num=11;
        do{
        tens=num/10;
        ones=num%10;
          if(tens==aDig || tens==bDig || tens==cDig || tens==dDig || tens==eDig || tens==fDig || 
            ones==aDig || ones==bDig || ones==cDig || ones==dDig || ones==eDig || ones==fDig){
          }else{
            System.out.println(num);
          }
          num++;
        }while(num<=99);
      }else{
        System.out.print("Invalid Input.");
      }
    }else{
      System.out.print("Invalid Input.");
    }
    

  }
}