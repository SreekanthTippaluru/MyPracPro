package patterns;

public class PatternsProgramme4 {
	
	public static void main(String[] args) {
		
		//int p = 0;
		
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 1; j < 9-i; j++) {
				//System.out.print(" ");
			}
			for (int K = 1; K <= i + 0; K++) {
				System.out.print("*");
			}
			
			System.out.println();
			//p=p+1;
			
		}
		
	}

}
