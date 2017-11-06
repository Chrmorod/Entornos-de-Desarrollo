package universidad;

import java.util.Scanner;

public class universidad {

	public static void main(String[] args) {
		//Declaración de punt = Puntuación (processing)
		int punt;
		Scanner teclado= new Scanner(System.in);
		//Output punt
		System.out.println("Marque su puntuación:");
		punt=teclado.nextInt();
		//Condiciónes anidadas relacionadas con la tabla del ejercicio & processing
		if (punt>=100) {
			System.out.println("Puedes acceder a todas las Facultades de: Sistemas, Electrónica, Industriales, Administración");
		}
		else {
			if(punt<100 && punt>=90) {
				System.out.println("Puedes acceder a las Facultades de: Electrónica, Industriales o Administración");	
				
			}
			else {
				if(punt<90 && punt>=80) {
					System.out.println("Puedes acceder a las Facultades de: Industrial o Administración");
				}
				else {
					if(punt<80 && punt>=70) {
					System.out.println("Puedes acceder unicamente a la Facultad de Administración");
					}
					else {
					System.out.println("No puedes acceder a ninguna de las Facultades, lo sentimos");	
					}
				}
			}
		}
			
	}

}

