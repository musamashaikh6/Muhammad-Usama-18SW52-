class Task4{
	String name;
	String rollno;
	int age;
	String department;
	public Task4(String name,String rollno,int age,String department){
	this.name=name;
	this.rollno=rollno;
	this.age=age;
	this.department=department;
	}
	public void showData(){
	System.out.print("Name:"+name+"\n"+"Roll NO:"+rollno+"\n"+"Age="+age+"\n"+"Department:"+department);
	}
	public static void main(String[]args){
	Task4 std1=new Task4("Muhammad Usama","18SW52",18,"Sotware");
	std1.showData();
	}
}
