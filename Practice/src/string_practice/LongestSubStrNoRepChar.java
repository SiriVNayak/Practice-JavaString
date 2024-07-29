package string_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStrNoRepChar {

	public static void main(String[] args) {
		LengthofLongestSubString("venkatesh");

	}

	private static void LengthofLongestSubString(String str) {
		String LongestSubstring = null;
		int LongestSubstringLen = 0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] arr = str.toCharArray();
		for (int i = 1; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			if(map.size() > LongestSubstringLen)
				LongestSubstringLen = map.size(); 
				LongestSubstring = map.keySet().toString();
		}

		System.out.println("LongestSubstring" + LongestSubstring);
		System.out.println("LongestSubstringLength" + LongestSubstringLen);

	}

}
