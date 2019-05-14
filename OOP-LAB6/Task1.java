class Author{
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender){
	this.name=name;
	this.email=email;
	this.gender=gender;
	}
	public String getName(){
	return name;
	}
	public String setEmail(String email){
	this.email=email;
	return this.email;
	}
	public char getGender(){
	return gender;
	}	

}
class Task1{
	public static void main(String[]args){
	Author athr=new Author("Muhammad Usama","muhammadusamashaikh110@gmail.com",'M');
    System.out.println("Name:"+athr.getName());
    System.out.println("Email:"+athr.setEmail("muhammadusamashaikh110@gmail.com"));
    System.out.println("Gender:"+athr.getGender());
	}
}