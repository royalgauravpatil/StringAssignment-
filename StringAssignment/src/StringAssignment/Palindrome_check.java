package StringAssignment;

import java.util.Scanner;

public class Palindrome_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String g = sc.next();
		String s2 = "";
		for (int i = g.length() - 1; i >= 0; i--) {
			s2 = s2 + g.charAt(i);

		}
		if (g.equals(s2)) {
			System.out.println("the string is palindrome");
		} else {
			System.out.println("the strinh is not palindrome");
		}
		sc.close();
	}
}
