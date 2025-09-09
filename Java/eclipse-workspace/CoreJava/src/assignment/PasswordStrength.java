package assignment;

import java.util.Scanner;

public class PasswordStrength {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String password = sc.nextLine();
		
		if (isStrong(password))
			System.out.println("Password strength: Strong.");
		else if (isMedium(password))
			System.out.println("Password strength: Medium.");
		else
			System.out.println("Password strength: Weak.");
		
		sc.close();
	}
	
	static boolean isStrong(String pass) {
		return pass.length() >= 8 && pass.matches(".*[A-Z].*") && pass.matches(".*[a-z].*") &&
				pass.matches(".*\\d.*") && pass.matches(".*[^a-zA-Z0-9].*");
	}
	
	static boolean isMedium(String pass) {
		return pass.length() >= 6 && pass.matches(".*[A-Z].*") && pass.matches(".*[a-z].*") &&
				pass.matches(".*\\d.*");
		
	}
}

