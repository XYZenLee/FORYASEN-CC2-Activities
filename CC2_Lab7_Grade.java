import java.util.Scanner;                   //Import Scanner class

public class CC2_Lab7_Grade{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);    //Instanciate Scanner
		int grade = in.nextInt();               //Enables user Input
		if (92<=grade && grade<=100){           //Range for a grade of A
			System.out.println("A");
		}
		else if (87<=grade && grade<=91){       //Range for a grade of B+
			System.out.println("B+");
		}
		else if (83<=grade && grade<=86){       //Range for a grade of B
			System.out.println("B");
		}
		else if (79<=grade && grade<=82){       //Range for a grade of C+
			System.out.println("C+");
		}
		else if (75<=grade && grade<=78){       //Range for a grade of C
			System.out.println("C");
		}
		else if (70<=grade && grade<=74){       //Range for a grade of D
			System.out.println("D");
		}
		else if(grade>=0 && grade<70){                                   //Range for a grade of F
			System.out.println("F");
		}
		else{
        System.out.println("Invalid Input.")
		}

	}
}