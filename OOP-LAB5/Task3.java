class Task3{
	String name;
	String breed;
	int age;
	public void setDetails(String name, String breed, int age){
	this.name=name;
	this.breed=breed;
	this.age=age;
	name="Tony";
	}
	public void showDetails(){
	System.out.print("Name:"+name+"\n"+"Breed:"+breed+"\n"+"Age="+age);
	}	
	public static void main(String[]args){
	Task3 dog1=new Task3();
	dog1.setDetails("Tony","Persian",4);
	dog1.showDetails();
	}
}