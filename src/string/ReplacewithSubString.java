package string;

public class ReplacewithSubString {
	
	public static void main(String[] args) {
		
		String str = "Selenium Webdriver Automation Testing";
		String s1 = "Webdriver";
		String s2 = "Java";
		
		String[] s = str.split(s1);
		
		StringBuffer sb = new StringBuffer(); 
		
		for (int i = 0; i < s.length-1; i++) {
			sb = sb.append(s[i]);
			if (i!=s.length-1) {
				sb=sb.append(s2);
			}
		}
		System.out.println(sb);
	}
}
