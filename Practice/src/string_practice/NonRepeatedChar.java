package string_practice;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChar {

	public static void main(String[] args) {
		String str = "AABCBECD";
		for (int i = 0; i < str.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;

				}
			}
			if (unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}
		System.out.println();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else
				map.put(str.charAt(i), 1);
		}
		for (Map.Entry<Character, Integer> ch : map.entrySet()) {
			if (ch.getValue() <= 1) {
				System.out.println(ch.getKey());
				break;
			}
		}
	}

}
