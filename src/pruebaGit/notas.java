package pruebaGit;

import java.util.Scanner;

/**
 * La clase notas permite el cálculo de notas de un estudiante
 * 
 * @author jmoug
 *
 */

public class notas {
	/**
	 * Se declaran las variables
	 */
	double nota1, nota2, nota3;
	double acu1, acu2, acu3, def;
	/**
	 * Utilizamos el escaner para introducir los datos
	 */
	Scanner entrada = new Scanner(System.in);

	/**
	 * Método para ingresar notas de un estudiante
	 */

	public void IngresarNotas() {
		/**
		 * Cuando ejecutamos este método queremos que nos pida notas
		 */
		System.out.println("ingrese las notas del estudiante");

		System.out.print("ingrese nota 1: ");

		uf1 = entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		uf2 = entrada.nextDouble();
		System.out.print("ingrese nota 3: ");

		uf3 = entrada.nextDouble();

	}

	/**
	 * Método para comprobar que se han introducido correctamente las notas
	 */

	public void comprobacion() {

		if (nota1 > 10) {
			System.out.println(" nota1 mal introducida");

		} else {
			System.out.println(" nota1 correcta");
		}

		if (nota2 > 10) {
			System.out.println(" nota2 mal introducida");

		} else {
			System.out.println(" nota2 correcta");
		}
		if (nota3> 10) {
			System.out.println(" nota3 mal introducida");

		} else {
			System.out.println(" nota3 correcta");
		}

	}

	/**
	 * Método para calcular la nota definitiva del estudiante
	 */

	public void Calculonotas() {
		acu1 = nota1 * 0.35;
		acu2 = nota2 * 0.35;
		acu3 = nota3 * 0.30;

		def = acu1 + acu2 + acu3;

		/**
		 * La nota está calculada, pero no la mostramos todavía, la mostraremos en el
		 * siguiente método
		 */
	}

	/**
	 * Método para mostrar las notas y la nota definitiva del estudiante
	 */
	public void Mostrar() {
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + nota1);
		System.out.println(" nota2 = " + nota2);
		System.out.println(" nota3 = " + nota3);

		System.out.println(" acumuado 1 = " + acu1);
		System.out.println(" acumuado 2 = " + acu2);
		System.out.println(" acumuado 3 = " + acu3);

		System.out.println(" nota definitiva es = " + def);

	}

	/**
	 * Método para comprobar si el estudiante ha aprobado o no
	 */

	public void aprobado() {

		if (def < 5 && def >= 0) {
			System.out.println("suspendio");
		} else {
			if (def >= 5 && def <= 10) {
				System.out.println("aprobado");
			} else {
				System.out.println(" error en la notas");
			}
		}
	}

	/**
	 * Método principal que llama a los otros métodos para el cálculo y muestra de
	 * las notas y determina si el estudiante aprobó o no
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * Creamos mecanismos para llamar a cualquier método fuera de la clase
		 */
		notas fc = new notas();

		fc.IngresarNotas();

		fc.comprobacion();

		fc.Calculonotas();

		fc.Mostrar();

		fc.aprobado();

	}

}
