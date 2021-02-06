import java.util.Scanner;

public class Inst_Scanner{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String nombre= "";
		int num1=0,num2=0;
		System.out.println("¿Cual es tu nombre?");
		nombre = in.nextLine();
		System.out.println("Dame un numero: ");
		num1= in.nextLine();
		System.out.println("Dame otro numero: ");
		num2= in.nextLine();
		System.out.println("Hola "+nombre+" el resultado de la suma es: "+num1+num2);
	}
}
