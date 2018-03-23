package interviewPrograms;

import java.util.Scanner;

public class NumberPolindrome {

	public static void main(String[] args) {
		
		//int num = 121;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int num = input.nextInt();
		
		int revNum = 0;
		int n;
		int temp;
		
		temp = num;
		while (num>0) {
			
			n = num % 10;
			revNum = revNum * 10 + n;
			num = num / 10;
		}
		
		if (temp==revNum) {
			System.out.println("Given number is polindrome");
		}else {
			System.out.println("Given number is not polindrome");
		}
	}
}
