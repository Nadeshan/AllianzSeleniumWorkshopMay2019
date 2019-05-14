import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		
		List<String> a1 = new ArrayList<String>();
		
		a1.add("Ram");
		a1.add("John");
		a1.add("Sam");
		a1.add("Mark");
		
		System.out.println(a1.size());
		
		List<String> a2 = new ArrayList<String>();
		
//		a2.add(a1.get(0));
//		a2.add(a1.get(1));
//		a2.add(a1.get(2));
	
		for (int i = 0; i < a1.size(); i++) {
			a2.add(a1.get(i));
		}
		
		for (String string : a2) {
			System.out.println(string);
		}
		
	}

}
