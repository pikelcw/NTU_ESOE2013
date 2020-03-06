public class GreenCrud {

	public static void main(String[] args) {
	}
	public int calPopulation (int initialSize, int days){
		int result = initialSize;
		int buffer1=0;
		int buffer2=0;
		for(int i=0; i < days/5; i++){
			buffer1=result;
			result=result+buffer2;
			buffer2=buffer1;
		}
		
		return result;
	}
}
