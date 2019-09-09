class FinalKeyword{
	final public void sum(int a, int b){
		System.out.println(a+b);
	}
}
class CheckFinalKeyword extends FinalKeyword{
	public void sum(int a, int b){
		System.out.println(a*b);
	}
}
class Task3{
	public static void main(String[]args){
		CheckFinalKeyword c=new CheckFinalKeyword();
		c.sum(3,8);
	}	
}