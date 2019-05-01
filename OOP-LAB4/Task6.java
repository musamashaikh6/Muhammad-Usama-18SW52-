import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task6{
	public static void main(String[] args) throws IOException {
		boolean isPresent=false;
		Integer index=null;
		int arr[]=new int[5];
		System.out.print("Enter Elements of Array:\n");
		Scanner akm=new Scanner(System.in);
		for(int a=0;a<arr.length;a++){
			arr[a]=akm.nextInt();
		} 
		 System.out.println();
		  for(int b=0;b<arr.length;b++){
		  	System.out.print(arr[b]+"   ");
		  }
		System.out.println("\nEnter an Element=");
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String input=buf.readLine();
		Integer num=Integer.valueOf(input);
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				isPresent=true;
				index=i;
			}}
			if(isPresent==true){
				System.out.print("Element is at Index of: "+index);
			}else{
				System.out.print("Element not Found");
			}
		
	}
}