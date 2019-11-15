import java.util.Scanner;

public class TryMagic{
	public static void main(String[]args){
		Scanner in   = new Scanner(System.in);
		System.out.print("Enter number of rows and columns: ");
		int squares  = in.nextInt(); 
		int magic[][]= new int[squares][squares];
		int row=0, col=0, num=1, sumR=0, sumC=0, sumD=0;
		for(row=0; row<squares;row++){
			for(col=0; col<squares;col++){
				magic[row][col]=0;
			}
		}

		row=0;
		col=(squares-1)/2;
		while(magic[squares-1][(squares-1)/2]==0){
			magic[row][col]=num;
			row--; col++; num++;
			if(row<0)	     row=squares-1;
			if(col>squares-1)col=0;
			if(magic[row][col]!=0){
				row++; if(row>squares-1)row=0;row++;
				col--; if(col<0)        col=squares-1;
			}
		}

		System.out.println();
		 System.out.print("\t");for(row=0; row<(squares*16+1); row++){System.out.print("-");}System.out.println();
		System.out.print("\t|");for(row=0; row<squares-1;row++){System.out.print("\t");}System.out.print("  MAGIC SQUARE  ");for(row=0; row<squares-1;row++){System.out.print("\t");}System.out.print("|\n");
		 System.out.print("\t");for(row=0; row<(squares*16+1); row++){System.out.print("-");}System.out.println();
		System.out.print("\t|");for(int i=0; i<squares;i++){System.out.print("\t\t|");}System.out.println();
		for(row=0; row<squares;row++){
			System.out.print("\t|");
			for(col=0; col<squares;col++){
				System.out.print("\t"+magic[row][col]+"\t|");
			}
			System.out.print("\n\t|");for(int i=0; i<squares;i++){System.out.print("\t\t|");}System.out.println();
		}
		System.out.print("\t");for(row=0; row<(squares*16+1); row++){System.out.print("-");}
	}
}