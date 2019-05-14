
public class CompareArray {	
	public static int biggerNumber(int[] intArr) {
		int num = intArr[0];
		for(int i=0; i<intArr.length; i++) {
			if(num<intArr[i]) {
				num = intArr[i];
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int[] myArr = {10, 42, 34, 55};
		int myNum;
		myNum = biggerNumber(myArr);
		System.out.println(myNum);
	}
}
