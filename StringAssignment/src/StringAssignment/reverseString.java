package StringAssignment;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String s = sc.nextLine();

		sc.close();
		String result = reverseWords(s);
		System.out.println(result);
	}

	public static String reverseWords(String str) {
		String[] s1 = str.split(" ");
		String reversed = "";

		for (int i = s1.length - 1; i >= 0; i--) {
			reversed += s1[i];
			if (i > 0) {
				reversed += " ";
			}
		}

		return reversed;
	}

}
