package leson3;

public class metod {
	void doSmth () {
	}
	
	static void printHello() {
		System.out.println("Hello World!");
	}
	
	static void printHelloUser(String userName) {
		System.out.println("Hello: " + userName);
	}
	
	void printHelloandHello() {
		System.out.println("Hello World!");
		System.out.println("Hello World!");
	}
	
	static void sum (int x, int y) {
		int c = x+y;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		printHello();
		printHelloUser("Kate");
		sum(3,5);
	}

}
