package string_practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String str = "Hello Nayak! How do you do?";
		/*
		 * RemoveDuplicateChars can be done By 4 approachs >using Java8, >Using
		 * indexOf(.) >using Character Array >Using Set Interface method
		 */
		System.out.println(str);
		
		//1st Approach
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c-> sb1.append((char)c));
		System.out.println(sb1);
		
		//2nd Approach
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			int inx = str.indexOf(ch, i+1);
			if(inx == -1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		//3rd
		char[] arr = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			boolean repated = false;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repated= true;
					break;
				}
			}
			if(!repated)
				sb3.append(arr[i]);
		}
		System.out.println(sb3);
		//4th
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character c : set) {
			sb4.append(c);
		}
		System.out.println(sb4);
	}

}
