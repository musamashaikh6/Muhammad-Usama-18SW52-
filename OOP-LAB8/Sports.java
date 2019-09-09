class Sports{
	String getNAme(){
		return "Generic Sports";
	}
	void getNumbersotTeamMembers(){
		System.out.println("Each Team has n players in "+getNAme());
	}
}
class Cricket extends Sports{
	String getNAme(){
		return "Cricket";
	}
	void getNumbersotTeamMembers(){
		System.out.println("Each Team has 11 players in "+getNAme());
	}
}
class Soccer extends Sports{
	String getNAme(){
		return "Soccer";
	}
	void getNumbersotTeamMembers(){
		System.out.println("Each Team has 11 players in "+getNAme());
	}
}
class Task2{
	public static void main(String[]args){
		Cricket ck=new Cricket();
		ck.getNumbersotTeamMembers();
		Soccer sc=new Soccer();
		sc.getNumbersotTeamMembers();
	}
}