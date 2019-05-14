import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> mySet = new HashSet<String>();            		
		mySet.add("S");                                       		
		mySet.add("E");                                       		
		mySet.add("L");
		mySet.add("E");
		mySet.add("N");
		mySet.add("I");
		mySet.add("U");
		mySet.add("M");	
		
		Iterator<String> iter = mySet.iterator();  
		//Traverse through all remaining elements in the Set  		
		
		while(iter.hasNext()) {                               		
			System.out.println(iter.next()); 	
		}
		
		for (String string : mySet) {
			System.out.println(string);
		}
	}

}
