package interviewPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int sum = input.nextInt();

		
		int x1=1;
		int x2=0;
		int x3;
		//int sum=15;
		
		System.out.println(x2);		
		for (int i = 2; i < sum; i++) {
			x3=x2+x1;
			System.out.println(x3);
			x1=x2;
			x2=x3;
		}
		
		
		
	}

}
