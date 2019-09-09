 import java.util.Scanner;
 interface AdvancedArithmetic{
	int sumofFactors(int n);
      }
  class MyCalculator implements AdvancedArithmetic{
     public int sumofFactors(int n){
	 int b=0;
	  for(int a=1; a<=n; a++){
		if(n%a==0){
		  b=b+a;
		}
	      }
	   return b;
	}
	public static void main(String[]args){
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter any Number: ");
	    int n=in.nextInt();
		MyCalculator c=new MyCalculator();
		System.out.print("Sum of Factors is: ");
		System.out.println(c.sumofFactors(n));
	}
   }