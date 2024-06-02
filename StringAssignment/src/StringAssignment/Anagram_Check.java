package StringAssignment;

import java.util.Arrays;

public class Anagram_Check {
	    public static boolean disp(String str1, String str2) {
	        str1 = str1.replaceAll("", "").toLowerCase();
	        str2 = str2.replaceAll(" "," ").toLowerCase();

	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();

	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        return Arrays.equals(arr1, arr2);
	    }

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";
	        String str3 = "triangle";
	        String str4 = "integral";
	        String str5 = "apple";
	        String str6 = "pale";

	        System.out.println( str1 + str2 + disp(str1, str2));
	        System.out.println( str3 +str4 + disp(str3, str4));
	        System.out.println( str5 + str6 + disp(str5, str6));
	    }
	

}
