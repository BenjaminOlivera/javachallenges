package vista1;

import java.util.Scanner;

public class Simplecal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner keyboardInput =  new Scanner (System.in);
     System.out.println("Enter a number");
     int num1 = keyboardInput.nextInt();
     System.out.println("Enter the second number");
     int num2 =keyboardInput.nextInt();
     System.out.println("Your result for the sum is: " + (num1 + num2));
	}

}
