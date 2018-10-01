package leson3;

public class overload {
	
	static void greetUser() {
		System.out.println("Hello User!");
	}
	static void greetUser(String name) {
		System.out.println("Hello " + name + "!");
	}
	
	public static void main(String[] args) {
		greetUser();
		greetUser("Lol");
	}
}
