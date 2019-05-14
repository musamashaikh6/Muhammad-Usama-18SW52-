import java.util.*;
class Task2{
   int []array=new int[5];
   public void populatearray(){
   	Scanner ip=new Scanner(System.in);
for(int a=0; a<array.length; a++){
	array[a]=ip.nextInt();
   }
}
	public void displayarray(){
		for(int b=0; b<array.length; b++)
		System.out.print(array[b]+"   ");
	}
	public static void main(String[]args){
	Task2 y=new Task2();
	y.populatearray();
	y.displayarray();
	}

}