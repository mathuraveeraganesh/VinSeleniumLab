package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number = 371; 
		int calculated = 0; 
		int original; 
		int remainder; 
		
		original = number; 
		
		while (number>0) {
			remainder = number%10; 
			number = number/10; 
			calculated = calculated + (remainder*remainder*remainder); 
		}

		if (calculated == original) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
		
	}

}
