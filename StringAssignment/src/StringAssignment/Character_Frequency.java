package StringAssignment;

public class Character_Frequency {

	public static void main(String[] args) {
		
	
	String s="GauravPatil";
	s=s.toLowerCase();
	char c[]=s.toCharArray();
	System.out.println("frequency of Character:-");
	for (int i = 0; i < c.length; i++) {
		int num=1;
		for (int j =i+1; j < c.length; j++) {
			if (c[i]==c[j]) {
				num++;
				c[j]='0';
			}
		}
		if (c[i]!='0') {
			System.out.print(c[i]+"="+num+",");
		}
	}
}
}
