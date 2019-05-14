
public class MyArrayComparison {

	public static void main(String[] args) {
		
		int[] myArr = {40,20,50,5};
		
		int largestnumber = getLargestNumber(myArr);
		
		System.out.println(largestnumber);

	}
	
	public static int getLargestNumber(int[] myIntegerArray) {
		int largest=0;
		largest = myIntegerArray[0];
		
		for(int i=0;i<myIntegerArray.length-1;i++) {
			
			if(largest<myIntegerArray[i+1]) {
				largest = myIntegerArray[i+1];
				System.out.println("--"+largest);
			}
			else {
				//largest = myIntegerArray[i];
				//System.out.println("--"+largest);
			}
		}
		
		return largest;
	}

}
