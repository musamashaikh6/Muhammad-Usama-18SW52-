class Task4{
	int l;
	int b;
	public void area(int b){
		this.b=b;
		System.out.println("Area of Square="+b*b);
			}
	public void area(int b, int l){
		this.b=b;
		this.l=l;
		System.out.println("Area of Rectangle="+b*l);
	}
	public static void main(String[]args){
		Task4 a1=new Task4();
		Task4 a2=new Task4();
		a1.area(4);
		a2.area(5,4);
	}
}