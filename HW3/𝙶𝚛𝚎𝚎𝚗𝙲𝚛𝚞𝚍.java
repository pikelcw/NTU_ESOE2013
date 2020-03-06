public class 𝙶𝚛𝚎𝚎𝚗𝙲𝚛𝚞𝚍 {

	public static void main(String[] args) {
	}
	public int 𝚌𝚊𝚕𝙿𝚘𝚙𝚞𝚕𝚌𝚊𝚝𝚒𝚘𝚗 (int 𝚒𝚗𝚒𝚝𝚒𝚊𝚕𝚂𝚒𝚣𝚎, int 𝚍𝚊𝚢𝚜){
		int result=𝚒𝚗𝚒𝚝𝚒𝚊𝚕𝚂𝚒𝚣𝚎;
		int buffer1=0;
		int buffer2=0;
		for(int i=0; i < 𝚍𝚊𝚢𝚜/5; i++){
			buffer1=result;
			result=result+buffer2;
			buffer2=buffer1;
		}
		
		return result;
	}
}
