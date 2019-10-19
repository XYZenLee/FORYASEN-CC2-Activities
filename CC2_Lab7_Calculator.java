import java.util.Scanner;							              //Summoning of tools needed

public class CC2_Lab7_Calculator{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);			      	//Instanciation of class to an object
		int q, fInt, sInt, sum;						                //Declaration of variables
		String opra;
		
		System.out.print("Enter # of operations: ");			//Politely asking for first user input
		q = in.nextInt();						                      //Program asks for a user input
		if(q>=1 && q<=100){
		  System.out.print("Enter all operations in one line: ");			//Politely asking for second user input
      for (int c=0; c!=q;c++){					                          //Loop to accommodate every operation the user inputs
        opra = in.next();
        if (opra.equals("negate")){				                        //Algorithm for 'negate' operation
          fInt = in.nextInt();
          if (fInt<0) System.out.println(Math.abs(fInt));
          else if (fInt==0) System.out.println(fInt);
          else System.out.println("-"+fInt);
          
        }
        else if (opra.equals("add")){		                    		//Algorithm for "add" operation
          fInt = in.nextInt();
          sInt = in.nextInt();
          sum = fInt + sInt;
          System.out.println(sum);
        }
        else if (opra.equals("max")){			                    	//Algorithm for "max" operation
          fInt = in.nextInt();
          sInt = in.nextInt();
          if (fInt>sInt) System.out.println(fInt);
          else if (fInt<sInt) System.out.println(sInt);
          else System.out.println(fInt);
        }
        else{					                                         	//To catch invalid user input
          System.out.println("Invalid Input.");
        }					                      	//Limitting user to input valid input

      }
		}
    else{
			System.out.println("Invalid Input.");
			
      }
     }
   }
