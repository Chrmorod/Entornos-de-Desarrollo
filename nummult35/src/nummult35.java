import java.util.Scanner;

public class nummult35 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	//Pedimos numero
	System.out.println("Inserte Numero");
	//Almacenamos en la variable num
	int num=teclado.nextInt();
	//condicion
	if(num%3==0 && num%5==0){
		//salida si el numero ES multiplo 3 y 5
		System.out.println("El numero "+num+" es multiplo de 3 y de 5");
	}else{
		//salida si el numero NO ES multiplo 3 y 5
		System.out.println("El numero "+num+" no es multiplo de 3 y de 5");
	}
	
	}

}
