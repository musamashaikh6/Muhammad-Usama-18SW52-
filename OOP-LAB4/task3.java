import java.util.*;
class Task3
{
	public static void main(String[]args){
		int x=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no:");
	int f= sc.nextInt();
	for(int i=1;i<=f;i++){
		x=x+i;
	}
	System.out.print("Sum of "+f+" Numbers is="+x);
	}
}