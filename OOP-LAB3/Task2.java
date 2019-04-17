import java.util.*;
class Task2{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Units of Bill=");
		int units=sc.nextInt();
		int bill;
		if(units<=50){
			bill=units*10;
			System.out.println("Bill="+bill);
		}
		else if(units>50 && units<=100){
			bill=(50*10)+(units-50)*15;
			System.out.println("Bill="+bill);
		}
		else if(units>100 && units<=200){
			bill=(50*10)+(100-50)*15+(units-100)*20;
			System.out.println("Bill="+bill);
		}
		else if(units>200 && units<=300){
		    bill=(50*10)+(50*15)+(100*20)+(units-200)*25;
		    System.out.println("Bill="+bill);
		}
		else{
		   bill=(50*10)+(50*15)+(100*20)+(100*25)+(units-300)*30;
		   System.out.println("Bill="+bill);  
		}
	}
}