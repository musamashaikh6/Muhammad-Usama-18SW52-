class Task3{
	int a;
	char ch;
	public Task3(int a, char ch){
	this.a=a;
	this.ch=ch;
	}
	public Task3(char ch, int a){
	this.ch=ch;
	this.a=a;
	}
	void showDetails1(){
	System.out.println(a+"   "+ch);
	}
	void showDetails2(){
	System.out.println(ch+"   "+a);
		}
		public static void main(String[]args){
		Task3 t1=new Task3(65,'A');
		Task3 t2=new Task3('B',66);
		t1.showDetails1();
		t2.showDetails2();
		}
}