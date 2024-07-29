package string_practice;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str = "   Hello Java Well come to learning  ";
		//A1
		/*
		 * String[] arr = str.split(" "); System.out.println(String.join("", arr));
		 */
		//A2
		/*
		 * for(int i=0;i<str.length();i++) { if(str.charAt(i)==' ') { str =
		 * str.substring(0,i)+str.substring(i+1); } } System.out.println(str);
		 */
		//A3
		String trimmedStr = str.trim();//this will remove spaces at front and end 
		System.out.println(trimmedStr);
		String nStr = str.replaceAll("\\s", "");
		System.out.println(nStr);
		
	}
}
