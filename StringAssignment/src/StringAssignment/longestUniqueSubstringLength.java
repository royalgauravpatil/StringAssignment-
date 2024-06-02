package StringAssignment;

public class longestUniqueSubstringLength {

	public static int m1(String str) {
		int n = str.length();
		int maxLength = 0;
		int start = 0;
		int[] index = new int[256]; //  ASCII values

		for (int i = 0; i < 256; i++) {
			index[i] = -1;
		}

		for (int end = 0; end < n; end++) {
			char currentChar = str.charAt(end);

			if (index[currentChar] >= start) {
				start = index[currentChar] + 1;
			}

			index[currentChar] = end;

			maxLength = Math.max(maxLength, end - start + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String str1 = "abcabcbb";
		String str2 = "bbbbb";
		String str3 = "pwwkew";
		String str4 = "abcdefg";
		String str5 = "dvdf";

		System.out.println(str1 + " is: " + m1(str1));
		System.out.println(str2 + " is: " + m1(str2));
		System.out.println(str3 + " is: " + m1(str3));
		System.out.println(str4 + " is: " + m1(str4));
		System.out.println(str5 + " is: " + m1(str5));
	}
}
