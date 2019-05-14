
public class Akhil {

	public static void main(String[] args) {
		Human Akhil;
		
		Akhil = new Human("Akhilreth", 30); //Constructor, if available will be called
		
		//Human.counter = Human.counter+1;
		
		String firstname = "Akhilreth";
		
		//Akhil.name = firstname.toUpperCase();
		//Akhil.setName(firstname);
		Akhil.talk();
		//Akhil.bloodcolor = "Green";
		
		System.out.println(Human.bloodcolor);
		System.out.println(Akhil.age);
		
		String lastname = "Dharmarethnan".toUpperCase();
		String capslastname = lastname.toUpperCase();
		
		int lengthofstring = Akhil.getName().length();
		
		System.out.println("Length of firstname = " +lengthofstring);
		System.out.println("Length of lastname = " +lastname.length());
		
		
		
		String fullname = Akhil.getName().concat(" ").concat(lastname); 
		
		fullname = firstname+" "+lastname;
		int a =100;
		int b = 200;
		System.out.println(a+""+b);
		
		System.out.println(fullname);
		
		boolean result;
		
		String expectedfirstname = "Akhil";
		
		//result = firstname.toLowerCase().contains(expectedfirstname.toLowerCase());
		result = Akhil.getName().startsWith(expectedfirstname);
		
		System.out.println("Result is " +result);
		
		
		Human Jessy = new Human();
		//Human.counter = Human.counter+1;
		System.out.println(Human.counter);
		
		
		//System.out.println("Full name = " +Akhil.name.concat(lastname));
		
		
	}

}
