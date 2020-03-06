
public class IsLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public boolean determine(int year){
		if(year % 4 == 0 & year % 100 !=0)
			return true;
		else if(year % 400 == 0)
			return true;
		else
			return false;
	}

}
