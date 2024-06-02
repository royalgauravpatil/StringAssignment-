package StringAssignment;

public class PermutationsofaString {

	public static String disp(String str, int i, int j) {
		char[] charArray = str.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return new String(charArray);
	}

	public static void info(String str, int start, int end) {
		if (start == end - 1) {
			System.out.println(str);
		} else {
			for (int i = start; i < end; i++) {
				str = disp(str, start, i);
				info(str, start + 1, end);
				str = disp(str, start, i);
			}
		}
	}

	public static void main(String[] args) {
		String str = "ABC";
		System.out.println("All the permutations of the string are:");
		info(str, 0, str.length());
	}
}
