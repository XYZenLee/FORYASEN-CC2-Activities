public class CC2_Lab3{
  public static void main (String[]args){
  char z = 'Z';
  char e = 'E';
  char n = 'N';
  char eM= '!';
  int  zA= z;
  int  eA= e;
  int  nA= n;
  int eMA= eM;
  int sum= zA+eA+nA+eMA;
  int prd= zA*eA*nA*eMA;
  int ave= sum/4;
  int rem= prd%ave;
  
  System.out.println(z + " - " + zA);
  System.out.println(e + " - " + eA);
  System.out.println(n + " - " + nA);
  System.out.println(eM + " - " + eMA);
  System.out.println(z+""+e+""+n+""+eM);
  System.out.println("Sum: "+sum);
  System.out.println("Product: "+prd);
  System.out.println("Average: "+ave);
  System.out.println("Remainder: "+rem);
  }
}