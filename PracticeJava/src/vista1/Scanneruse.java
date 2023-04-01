package vista1;

import java.util.Scanner;

public class Scanneruse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner keyboardInput  = new Scanner(System.in);
			System.out.print("Enter Your Name :");
			String name = keyboardInput.nextLine();
			
			System.out.print("Enter Your Age: ");
			String age = keyboardInput.nextLine();/* int age = keyboardInput.nextint(); */
			System.out.print("Hey " + name + " you are " + age  +" years old!");
	}

}
