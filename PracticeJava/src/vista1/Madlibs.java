package vista1;

import java.util.Scanner;

public class Madlibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner keyboardImput = new Scanner(System.in);
    System.out.println("Enter a color");
    String color = keyboardImput.nextLine(); /*cuando trabajamos conm String usamos el nextLine */
    System.out.println("Enter a plural noun");
    String pluralNoun = keyboardImput.nextLine();
    System.out.println("Enter a hobby");
    String hobby = keyboardImput.nextLine();
    System.out.println("Roses are "+ color +"\n"
    		           + pluralNoun + " are cyan\n"
    		           +"I enjoy " + hobby);
	}
    
}
