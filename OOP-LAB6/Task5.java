class Student{
	private String name;
	private int age;
	private String adress;
	Student(){
		name="unknown";
		age=0;
		adress="unknown";
	}
	public void setInfo(String name, int age){
		this.name=name;
		this.age=age;
		System.out.print("Name of Student:"+this.name+"\n"+"Age of Student="+this.age);
	}
	public void setInfo(String name, int age, String adress){
		this.name=name;
		this.age=age;
		this.adress=adress;
		System.out.print("Name of Student:"+this.name+"\n"+"Age of Student="+this.age+"\n"+"Adress of Student:"+this.adress+"\n");
	}
}
class Task5{
	public static void main(String[]args){
		Student[] std=new Student[10];
		for(int a=0; a<std.length ; a++){
			std[a]=new Student();
		}
		std[0].setInfo("Muhammad Usama",18,"MUET Hostel, Jamshoro");
		std[1].setInfo("Yasir Abbas",18,"MUET Hostel");
		std[2].setInfo("Mohammad Khan",18,"MUET Hostel");
		std[3].setInfo("Imtiaz Ahmed",18,"MUET Hostel");
		std[4].setInfo("Waqar Ali",18,"Jamshoro");
		std[5].setInfo("Uzair Ahmed",18,"Jamshoro");
		std[6].setInfo("Ahmed Ali",18,"Qasimabad, Hyderabad");
		std[7].setInfo("Sarwan Dahri",18,"MUET Hostel");
		std[8].setInfo("Abdul Qudoos",18,"Qasimabad Hyderabad");
		std[9].setInfo("Mudassir Ahmed",18,"Qasimabad Hyderabad");
	}
}