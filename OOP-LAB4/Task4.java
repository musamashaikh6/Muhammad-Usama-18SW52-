import java.util.*;
class Task4
{
   public static void main(String[]args){
   int arr1[][]=new int[3][3];
   int arr2[][]=new int[3][3];
   int arr3[][]=new int[3][3];
   Scanner sc=new Scanner (System.in);
     for(int x=0; x<3; x++){
        for(int y=0; y<3; y++){
        System.out.print("arr1["+x+"]["+y+"]=");
        arr1[x][y]=sc.nextInt();
        }
      }
      for(int x=0; x<3; x++){
        for(int y=0; y<3; y++){
        System.out.print("arr2["+x+"]["+y+"]=");
        arr2[x][y]=sc.nextInt();
        }
      }

      for(int x=0; x<3; x++){
        for(int y=0; y<3; y++){
        arr3[x][y]=arr1[x][y]+arr2[x][y];
        System.out.println(arr3[x][y]);
        }	
      }

     }
   }   