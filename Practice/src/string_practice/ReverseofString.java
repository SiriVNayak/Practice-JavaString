package string_practice;

public class ReverseofString {

	public static void main(String[] args) {
		/*
		 * 4 differet ways to do it >Using toCharArray() >Using charAt(int index) >Using
		 * SpringBuffer's reverse() >Using SpringBuilder's reverse()
		 */
		String str = "Hello Nayak! How do you do?";
		int l = str.length();
		System.out.println(str);
		//First Approach
		
		char[] chArr = str.toCharArray();
		for(int i =l-1;i>=0;i--)
			System.out.print(chArr[i]);
		
		System.out.println();
		//	Second Approach	
		for (int i = l - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		//Third Approach
		StringBuffer sb =  new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//Forth Approach
		StringBuilder sd = new StringBuilder(str);
		System.out.println(sd.reverse());
		
		
	}

}
