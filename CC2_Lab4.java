import java.util.Scanner;

public class CC2_Lab4{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.print("Input name:");
    String name = in.nextLine();
    
    if(name.equals("Jhim")||name.equals("Ethan")){
      System.out.print("Input age:");
      int age = in.nextInt();
      if(age<5)
        System.out.println("You are not yet allowed to keep pets.");
      else if (age>=5 && age<=10)
        System.out.println("Hamster, Dog");
      else if (age>=11&& age<=15)
        System.out.println("Spider, Dog");
      else if (age>=16&& age<=20)
        System.out.println("Dog, Snake");
      else if (age==21)
        System.out.println("No Pets, Not Interested");
      else
        System.out.println("You are too old to own a pet.");
    }
    
    else if (name.equals("Sally")||name.equals("Joy")){
      System.out.print("Input age:");
      int age = in.nextInt();
      if(age<5)
        System.out.println("You are not yet allowed to keep pets");
      else if (age>=5 && age<=10)
        System.out.println("Hamster, Cat");
      else if (age>=11&& age<=15)
        System.out.println("Cat, Rabbit");
      else if (age>=16&& age<=20)
        System.out.println("Cat");
      else 
        System.out.println("No Pets, Not Interested");
    }
    
    else{
      System.out.println("You are not on the list.");
    }
  }
}
