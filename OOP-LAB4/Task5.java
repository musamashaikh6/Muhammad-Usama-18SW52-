class Task5
{
	public static void main(String[]args){
		int array[]={3,6,9,2,4,8};
		int Max=0;
	for(int a=0; a<array.length; a++){
		if(array[a]>Max){
			Max=array[a];
		}
	}
	System.out.print("Max no: is="+Max);
	}
	
}