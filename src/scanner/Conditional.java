package scanner;

public class Conditional {
	
	//if,if else,else if
	// user 2 numbers a and b 1)equal 2)a is greater 3)b is greater
	
	public static void main(String[] args) {
	//	int age=20;
	//	if(age>18)
	//		System.out.println("eligible for vote");
	//	System.out.println("thankyou");
	//	System.out.println("welcome");
		
	//	else {
	//		System.out.println("you are not eligible for voting");
	//	}
		
		int a=20;
		int b=45;
		if (a==b) {
			System.out.println("a and b are equals");
		}
		else if(a>b) {
			System.out.println("a is greater");
		}
	//	else if(b>a) {
	//		System.out.println("b is greater");
	//	}
		else {
			System.out.println("b is greater");
		}
	}

}
