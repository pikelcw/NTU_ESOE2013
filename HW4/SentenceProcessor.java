
public class SentenceProcessor {

	public static void main(String[] args) {
//		SentenceProcessor sp = new SentenceProcessor();
//		System.out.println(sp.removeDuplicatedWords("Hello Hello World I love love the World I lovelove the World"));
//		System.out.println(sp.removeDuplicatedWords("Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo"));
//		System.out.println(sp.removeDuplicatedWords("a a la a la carte A la La carte Carte A a la la"));
//		System.out.println(sp.replaceWord("major", "minor", "The major problem is how to sing in A major"));
//		System.out.println(sp.replaceWord("on", "off", "Turn on the television I want to keep the television on"));
//		System.out.println(sp.replaceWord("love", "hate", "I love the World I lovelove the Love"));
	}
	public String removeDuplicatedWords(String sentence){
		boolean flag=true;
		String[] splitedSentence = sentence.split(" ");
		String result = "";
		for(int i=0 ; i< splitedSentence.length ; i++){
			flag = true;
			//System.out.println(splitedSentence[i]);
			for(int j= 0 ; j < i  ; j++){
				//System.out.printf("i = %d %s , j = %d %s\n",i,splitedSentence[i],j,splitedSentence[j]);
				if(splitedSentence[i].contentEquals(splitedSentence[j])){
					flag = false;
					//System.out.println("!!!!!!!!!!!!!");
				}
			}
			//System.out.println(flag);
			if(flag == true)
				result = result + " " + splitedSentence[i];
		}
		result = result.trim();
		return result;
		
		//return Arrays.stream(sentence.split(" ")).distinct().collect(Collectors.joining(" "));
	}
	public String replaceWord(String target, String replacement, String sentence){
		String[] splitedSentence = sentence.split(" ");
		String result = "";
		for(int i=0 ; i< splitedSentence.length ; i++){
			if(splitedSentence[i].contentEquals(target)){
				splitedSentence[i] = replacement;
			}
		}
		
		for(int i=0 ; i< splitedSentence.length ; i++)
			result = result + " " + splitedSentence[i];
		
		result = result.trim();
		return result;
	}
}

