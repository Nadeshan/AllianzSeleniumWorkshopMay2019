public class Human {
	//Properties of the class
	static final String bloodcolor = "Red";
	static int counter = 0;
	private String name;
	String gender;
	int age;
	
	//This is a constructor
	public Human() {
		counter=counter+1;
	}
	
	public Human(String myName) {
		name = myName;
		counter++;
	}
	
	public Human(String myName, int myAge) {
		name = myName;
		age = myAge;
		counter++;
	}
	
	//Behaviors of the class
	public void walk() {
		System.out.println(name + " is walking");
	}
	public void talk() {
		System.out.println(name + " is talking");
	}
	
	public void setName(String namefromobject) {
		name = namefromobject.toUpperCase();
	}
	
	public String getName() {
		return name;
	}
}