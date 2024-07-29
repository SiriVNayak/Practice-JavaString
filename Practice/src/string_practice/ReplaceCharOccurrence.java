package string_practice;

public class ReplaceCharOccurrence {
	public static void main(String[] args) {
		String str = "OPENTEXTE";
		char chtoRep = 0;
//		if(str.indexOf(chtoRep) == -1) {
//			System.out.println("No Character found");
//			System.exit(0);
//		}
//		else {
//			int count=1;
//			for(int i=0;i<str.length();i++) {
//				if(str.charAt(i)==chtoRep) {
//					str = str.substring(0, i) + count
//				              + str.substring(i + 1);
//					count++;
//				}
//			}
//		}
//		System.out.println(str);
		/*
		 * String oStr = str; for (int i = 0; i < str.length(); i++) { int count = 1;
		 * char ch = str.charAt(i); for (int j = i + 1; j < str.length(); j++) {
		 * 
		 * if (ch == str.charAt(j) && count == 1) { str = str.substring(0, i) + count +
		 * str.substring(i + 1); count++; str = str.substring(0, j) + count +
		 * str.substring(j + 1); } if (ch == str.charAt(j) && count > 1) {
		 * System.out.println(str.charAt(i)); count++; count++; str = str.substring(0,
		 * j) + count + str.substring(j + 1); } } } System.out.println(oStr);
		 * System.out.println(str);
		 */
		System.out.println(str);
		for (int j = 0; j < str.length(); j++) {
			chtoRep = str.charAt(j);
			int ct = 1;
			for (int i = j + 1; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch == chtoRep) {
					str = str.replaceFirst(String.valueOf(chtoRep), String.valueOf(ct));
					ct++;
				}
			}
		}
		System.out.println(str);

	}
}
