package string;

public class RemoveCharFromGivenString {

	public static String removeChar(String str, char c){
		
		if (str==null)
			return null;
			return str.replaceAll(Character.toString(c),"");
		//return str;
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(removeChar("chicago", "c"));
	}
	
}
