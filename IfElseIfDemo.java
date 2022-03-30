package basic;

public class IfElseIfDemo {

	public static void main(String[] args) {
		
		int num1 = 105;
		int num2 = 100;
		
		// if ... else if... else 
		
		if (num1>num2)
			System.out.println("num1 is bigger");
		else if (num1>num2)
			System.out.println("num2 is bigger");
		else if (num1==num2)
			System.out.println("Both are the same");
		else
			System.out.println("ERROR");
	}

}
