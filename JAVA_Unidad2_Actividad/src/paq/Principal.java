package paq;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String opcion = "s";

		do {

			System.out.println("Bienvenido al Sistema!\n");
			System.out.println("Ingrese nombre: ");
			String nombre = scan.nextLine();
			System.out.println("Ingrese apellido: ");
			String apellido = scan.nextLine();
			System.out.println("Ingrese edad: ");
			String edad = scan.nextLine();
			System.out.println("Ingrese hobbie: ");
			String hobbie = scan.nextLine();
			System.out.println("Ingrese editor de código preferido: ");
			String editorCodigo = scan.nextLine();
			System.out.println("Ingrese sistema operativo que utiliza: ");
			String sistemaOperativo = scan.nextLine();

			System.out.println("\nLos datos ingresados son: ");
			System.out.println("Tu nombre es: " + nombre);
			System.out.println("Tu apellido es: " + apellido);
			System.out.println("Tu edad es: " + edad);
			System.out.println("Tu hobbie es: " + hobbie);
			System.out.println("Tu editor de código preferido es: " + editorCodigo);
			System.out.println("Tu sistema operativo es: " + sistemaOperativo);

			do {
				System.out.println("\n\nDesea cargar otros datos? s/n");
				opcion = scan.nextLine();
			} while (!opcion.equals("s") && !opcion.equals("n"));

		} while (opcion.equals("s"));

		System.out.println("\nAdios!");

		scan.close();

	}

}
