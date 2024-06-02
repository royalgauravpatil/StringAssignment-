package StringAssignment;

public class Remove_Duplicates {
    public static String info(String str) {
        boolean[] b = new boolean[256]; 
        char[] resultArray = new char[str.length()];
        int index = 0;

        for (char c : str.toCharArray()) {
            if (!b[c]) {
                b[c] = true;
                resultArray[index++] = c;
            }
        }

        return new String(resultArray, 0, index);
    }
    
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("String with duplicates: " + str);
        String result = info(str);
        System.out.println("String after removing duplicates: " + result);
    }
}
