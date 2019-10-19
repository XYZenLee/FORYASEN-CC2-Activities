import java.util.*;
public class Numbers3{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int aDig=0, bDig=0, cDig=0, dDig=0, eDig=0, fDig=0, tens=0, ones=0;
    System.out.print("Please input 6 digits[0~9]: ");
      try{
        aDig = in.nextInt();bDig = in.nextInt();cDig = in.nextInt();dDig = in.nextInt();eDig = in.nextInt();fDig = in.nextInt();
      }catch(InputMismatchException e){
        System.out.print("Invalid Input.");}
      if(aDig>=0 && aDig<=9 && bDig>=0 && bDig<=9 && cDig>=0 && cDig<=9 && dDig>=0 && dDig<=9 && eDig>=0 && eDig<=9 && fDig>=0 && fDig<=9){
        for(int num=11;num<=99;num++){
          tens=num/10; ones=num%10;
          if(tens==aDig || tens==bDig || tens==cDig || tens==dDig || tens==eDig || tens==fDig || ones==aDig || ones==bDig || ones==cDig || ones==dDig || ones==eDig || ones==fDig){
            continue;}
            System.out.println(num);}
      }else {System.out.print("Invalid Input.");}}}