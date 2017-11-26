import java.util.Scanner;
public class Estaciones {

	public static void main(String[] args) {
		int num; String est;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Inserte un numero entre el 1 y 4: ");
		num=teclado.nextInt();
		switch(num){
			case 1:
				est="Verano";
				break;
			case 2:
				est="Otoño";
				break;
			case 3:
				est="Invierno";
				break;
			case 4:
				est="Primavera";
				break;
			default:
				est="erronea";
		}
		System.out.println("La estación elegida ha sido: "+est);
	}
}