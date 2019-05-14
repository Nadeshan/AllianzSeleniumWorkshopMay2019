
public class MonthCalculator {

	public static void main(String[] args) {
		String month = getMonthString(5);
		System.out.println(month);
		
		int i=0;
		while (i<13) {
			System.out.println(getMonthString(i));
			i++;
		}
		
		for (int j=4; j<11; j++) {
			System.out.println(getMonthString(j));
		}
		
		int k=1;
		do {
			System.out.println(getMonthString(k));
			k++;
		} while (k<=13);
	}
	
	public static String getMonthString(int monthnumber) {
		String monthstring;
		switch (monthnumber) {
		case 1:
			monthstring = "January";
			break;
		case 2:
			monthstring = "February";
			break;
		case 3:
			monthstring = "March";
			break;
		case 4:
			monthstring = "April";
			break;
		case 5:
			monthstring = "May";
			break;
		case 6:
			monthstring = "June";
			break;
		case 7:
			monthstring = "July";
			break;
		case 8:
			monthstring = "August";
			break;
		case 9:
			monthstring = "September";
			break;
		case 10:
			monthstring = "October";
			break;
		case 11:
			monthstring = "November";
			break;
		case 12:
			monthstring = "December";
			break;

		default:
			monthstring = "Invalid number entered";
			break;
		}
		
		return monthstring;
	}

}
