package StringAssignment;

public class StringCompression {

	public static String m1(String str) {
		String compressed = "";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				compressed += str.charAt(i) + String.valueOf(count);
				count = 1;
			}
		}

		return compressed.length() < str.length() ? compressed : str;
	}

	public static void main(String[] args) {
		String str1 = "aabcccccaaa";
		String str2 = "abcdef";
		String str3 = "aaabbc";

		System.out.println(str1 + ": " + m1(str1));
		System.out.println(str2 + ": " + m1(str2));
		System.out.println(str3 + ": " + m1(str3));
	}

}
