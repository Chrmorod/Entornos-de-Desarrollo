package import_ex_uni;

import java.util.Scanner;

public class import_ex_uni {

	public static void main(String[] args) {
		// Declaración clgio = colegio y nvl = nivel socioeconómico, letras de nivel socieconomico (A,B,C), colegio de procedencia nat =nacional o part = particular
		String clgio, letra1 = "A", letra2 = "B", letra3 = "C", nat="Nacional",nvl,part ="Particular";
		Scanner teclado= new Scanner(System.in);
		//Output colegio(clgio)
		System.out.println("Indique el colegio de procendencia --> Nacional o Particular:");
		clgio=teclado.next();
		//Output nivel socieconomico(nvl)
		System.out.println("Indique el nivel socioeconomico que estime --> A,B,C");
		nvl=teclado.next();
		//Condiciones anidadas & processing
		if(clgio.equals(nat) && nvl.equals(letra1)) {
				System.out.println("El importe que debe pagar son 300 Eur");
		}
			else {
				if(nvl.equals(letra2)) {
				System.out.println("El importe que debe pagar son 200 Eur");
				}
				else {
					if(nvl.equals(letra3)) {
						System.out.println("El importe que debe pagar son 100 Eur");
					}
					else{
						if(clgio.equals(part) && nvl.equals(letra1)) {
							System.out.println("El importe que debe pagar son 400 Eur");
						}
							else {
									if(nvl.equals(letra2)) {
									System.out.println("El importe que debe pagar son 300 Eur");
									}
									else {
										if(nvl.equals(letra3)) {
											System.out.println("El importe que debe pagar son 200 Eur");
										}
										else {
											System.out.println("Valor incorrecto");
										}
									}
								}
						}
					}
				}

	}
}