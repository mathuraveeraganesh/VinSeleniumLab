package week1.day1;

public class SwitchOperator {

	public static void main(String[] args) {
		
		int a = 5; 
		int b = 2; 
		
		int operations = 3; 
		
		switch (operations) {
		case 1:				
			int add = a + b; 
			System.out.println(add);
			break; 
		
		case 2: 
			int sub = a - b; 
			System.out.println(sub);
			break; 
			
		case 3: 
			int mul = a * b; 
			System.out.println(mul);
			break; 
			
		case 4: 
			int div = a / b; 
			System.out.println(div); 
			break; 

		default: 
			System.out.println("Out of case");
			break;
		}

	}

}
