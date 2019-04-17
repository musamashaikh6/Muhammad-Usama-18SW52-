import java.util.*;
class Task1{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter your Marks in C++=");
		int a=sc.nextInt();
		System.out.print("Enter your Marks in Data Structure=");
		int b=sc.nextInt();
		System.out.print("Enter your Marks in OS=");
		int c=sc.nextInt();
		int z=(a+b+c);
		int tm=300;
		System.out.println("Obtained Marks="+z);
		double per=z*100/tm;
		System.out.println("Percentage="+per);
		if(per>=90){
			System.out.println("A-Grade");
		}
		else if(per>=80 && per<90){
			System.out.println("B-Grade");
		}
		else if(per>=70 && per<80){
			System.out.println("C-Grade");
		}
		else if(per>=60 && per<70){
			System.out.println("D-Grade");
		}
		else{
		System.out.println("Fail");
	}
	}
}