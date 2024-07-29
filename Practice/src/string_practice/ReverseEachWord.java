package string_practice;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "Hello Nayak! How do you do?";
		String[] words = str.split(" ");
		String rStr= "";
		System.out.println(str);
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			for(int j=word.length()-1;j>=0;j--)
				rStr = rStr+word.charAt(j);
			rStr=rStr+" ";
		}
		System.out.println(rStr);
	}

}
