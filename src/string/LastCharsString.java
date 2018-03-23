package string;

public class LastCharsString {

	public static void main(String[] args) {
		
/*		String str = "sreekanthsele";
		
		char lastchat = str.charAt(str.length() -1);
		
		System.out.println("last character:" +lastchat );*/

		
		
		String str = "selenium";
		String lastTwo = null;
		if (str != null) 
		{  
		    lastTwo = str.substring(str.length() - 2);
		}
		
		System.out.println("last characters: " +lastTwo);
		
		
	}

}
