import java.util.Scanner;
public class EstacionesMes {

	public static void main(String[] args) {
		String est;int mes;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte el mes: ");
		mes=teclado.nextInt();
		switch(mes){
			case 1:
				est="Invierno";
				break;
			case 2:
				est="Invierno";
				break;
			case 3:
				est="Primavera";
				break;
			case 4:
				est="Primavera";
				break;
			case 5:
				est="Primavera";
				break;
			case 6:
				est="Verano";
				break;
			case 7:
				est="Verano";
				break;
			case 8:
				est="Verano";
				break;
			case 9:
				est="Otoño";
				break;
			case 10:
				est="Otoño";
				break;
			case 11:
				est="Invierno";
				break;
			case 12:
				est="Invierno";
				break;
			default:
				est="erronea";
		}
		System.out.println("Has pulsado el mes: "+mes+" corresponde con la estación: "+est);
		
	}

}
