package string;

public class ReverseStringwitoutFunctions {

	public static void main(String[] args) {
		
		String str = "Selenium Webdriver Automation Testing";
		
		/*String[] s = str.split(" ");
		
		for (int i = s.length-1; i >=0 ; i--) {
			System.out.print(s[i]+" ");
		}*/
		
		int len = str.length();
		StringBuffer sb = new StringBuffer();
		
		for (int i = len-1; i > 0; i--) {
			sb = sb.append(str.charAt(i));
		}
		
		System.out.println(sb);
		
	}

}
