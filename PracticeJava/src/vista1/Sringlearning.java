package vista1;

public class Sringlearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Benjamin \n Olivera"); /*backslash para salto de linea*/
     
     String phrase = "brian benjamin olivera colonio";
     System.out.println(phrase.toUpperCase());  /* la variable se imprie sin comillas*/ /*usando el metodo toUpperCase*/
     System.out.println(phrase.toLowerCase());
     System.out.println(phrase.length()); /*numero de caracteres*/
     System.out.println(phrase.contains("benjamin"));
     System.out.println(phrase.charAt(3)); /* me da la letra que ocupa el tercer lugar*/
     System.out.println(phrase.indexOf("b")); /* me da el primer caracter del string*/
     System.out.println(phrase.lastIndexOf("b"));
	}

}
