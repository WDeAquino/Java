import java.util.Scanner;

public class P13{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("¿Cuantos alumnos son? ");
		int num= in.nextInt();
		String Alumnos[]=new String[num];
		for(int i=0;i<Alumnos.length;i++){
			System.out.print("Ingresa el alumno "+i+": ");
			Alumnos[i] = in.nextLine();
		}
		System.out.println("Numero de alumnos: "+Alumnos.length);
		System.out.println("Los alumnos son: ");
		for(int i=0;i<Alumnos.length;i++){
			System.out.println(Alumnos[i]);
		}	
	}
}