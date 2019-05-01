class Task1
{
	public static void main(String[]args)
	{
		int l=1;
		for(int a=1; a<=5; a++){
			for(int b=1; b<=a; b++){
				System.out.print("*");
			}
			System.out.println();
		}System.out.print("\n"+"\n");
	for(int x=5; x>=1; x--){
		for(int y=1; y<=x; y++){
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.print("\n"+"\n");
	for(int i=1; i<=5; i++){
		for(int j=5; j>=i; j--){
		System.out.print(" ");
		
	}
	for(int k=1; k<=l; k++){
		System.out.print("*");
	}
	System.out.println();
	l+=2;
  }
 }
}
