package class13;

public class SplitDemo {

	public static void main(String[] args) {
		
		//	count words in one sentence
		
		String str1="Nasratullah want to be a milloniar";
		
		String [] strArray= str1.split(""); // if we grab space (" ") so it display word
		
		System.out.println(strArray.length);
		
		String sentences="java is good . batch2 like java . but some of them do homework . they are getting better .";
		
		String [] sentenceArray= sentences.split(" . ");
		
		System.out.println(sentenceArray.length);
		
		for (String s:sentenceArray) {
			
			System.out.println(s);
			
		}

	}
}