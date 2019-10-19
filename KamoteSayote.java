import java.util.*;

public class KamoteSayote {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	 
    System.out.print("Enter Input: ");
    int n,m,k; 

      try{
        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();
      }catch(InputMismatchException e){
        System.out.println("Invalid Input.");
        return;
      }
    
    
    int x = n/m;
    int y = n%m*k;
    
    if(n<=1000 && n>=1 && m<=1000 && m>=1 && k<=1000 && k>=1 && m<=n){
    	System.out.println(x + " kamotes\n"+ y +" sayotes");
    }else{
    	System.out.println("Invalid Input.");
    }
    
  }
}
