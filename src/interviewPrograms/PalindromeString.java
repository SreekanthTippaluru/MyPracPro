package interviewPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		//String str = "sreekanth";
		String rev = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = input.nextLine();
		
		int strLength = str.length();
		
		for (int i=strLength - 1; i >=0 ; i--) {
			
			rev = rev+str.charAt(i);
		
		}
		
		if (str.equals(rev)) {
			System.out.println("Given string is polindrome");
		}else{
			System.out.println("Given string is not a polindrome");
		}
		
	}

}
