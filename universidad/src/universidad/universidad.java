package universidad;

import java.util.Scanner;

public class universidad {

	public static void main(String[] args) {
		//Declaraci�n de punt = Puntuaci�n (processing)
		int punt;
		Scanner teclado= new Scanner(System.in);
		//Output punt
		System.out.println("Marque su puntuaci�n:");
		punt=teclado.nextInt();
		//Condici�nes anidadas relacionadas con la tabla del ejercicio & processing
		if (punt>=100) {
			System.out.println("Puedes acceder a todas las Facultades de: Sistemas, Electr�nica, Industriales, Administraci�n");
		}
		else {
			if(punt<100 && punt>=90) {
				System.out.println("Puedes acceder a las Facultades de: Electr�nica, Industriales o Administraci�n");	
				
			}
			else {
				if(punt<90 && punt>=80) {
					System.out.println("Puedes acceder a las Facultades de: Industrial o Administraci�n");
				}
				else {
					if(punt<80 && punt>=70) {
					System.out.println("Puedes acceder unicamente a la Facultad de Administraci�n");
					}
					else {
					System.out.println("No puedes acceder a ninguna de las Facultades, lo sentimos");	
					}
				}
			}
		}
			
	}

}

