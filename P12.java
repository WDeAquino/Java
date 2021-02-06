import java.util.Scanner;

public class P12{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String In1="";
		int a,b;
		System.out.print("Ingresa una cadena de caracteres: ");
		In1 = in.nextLine();
		System.out.println("La cadena tiene "+In1.length()+" caracteres");	
		System.out.print("Desde donde imprimir la cadena: ");
		a = in.nextInt();
		System.out.print("Desde donde dejar de imprimir la cadena: ");
		b = in.nextInt();
		System.out.println(In1.substring(a,b));		
	}
}