package string;

public class CapitalizetheFirstCharAtString {

	public static void main(String[] args) {
		
		String str = "selenium webdriver automation testing";
		StringBuffer sb = new StringBuffer(str.length());
		String[] words = str.split("\\ ");
		
		for (int i = 0; i < words.length; i++) {
			sb.append(Character.toUpperCase(words[i].charAt(0)))
			  .append(words[i].substring(1))
			  .append(" ");
			}
		System.out.println("String after append: "+ sb);
		
	}

}
