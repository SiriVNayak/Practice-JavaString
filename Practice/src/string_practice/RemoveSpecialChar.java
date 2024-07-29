package string_practice;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str = "Hello nayak!, How are u? @ gmail.com";
		String nStr = str.replaceAll("[^A-Za-z0-9\\s]", "");
		System.out.println(nStr);
	}

}
