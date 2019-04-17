import java.util.*;
class Task4
{
	public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter 1st Number=");
      int a=sc.nextInt();
      System.out.print("Enter 2nd Number=");
      int b=sc.nextInt();
      int add=a+b;
      int sub=a-b;
      int mul=a*b;
      int div=a/b;
         System.out.println("Addition="+add);
         System.out.println("Subtraction="+sub);
         System.out.println("Multiplication="+mul);
         System.out.println("Division="+div);
	}
}