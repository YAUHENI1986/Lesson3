package leson3;

public class metod3 {
	static int calculate (int x, int y, char o) {
		int result = 0;
		switch (o) {
		case '+':
			result = x+y;
			break;
		case '-':
			result = x-y;
			break;
		case '*':
			result = x*y;
			break;
		case '/':
			// insert y validation
			if (validateDenominator(y)) {
				result = x/y;
			} else {
				System.out.println("Cant divide by zero ");
			}
			
			break;
		}
		return result;
	}
	static void printC(int res) {
		System.out.print("The result ot the operatoion ");
		System.out.println(res);
	}
	
	static boolean validateDenominator (int y) {
		if (y>0) {
			return true;
		} else
			return false;
	}
	
	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		char operation = '/';
		int result = calculate (x,y, operation);
		printC(result);
	}
}
