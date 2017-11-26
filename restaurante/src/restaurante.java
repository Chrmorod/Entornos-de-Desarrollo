import java.util.Scanner;
public class restaurante {

	public static void main(String[] args) {
		double imp,imptotal,descu,impues,imptotal2,descu2,impues2;
		Scanner teclado = new Scanner(System.in);
		//Pedimos numero
		System.out.println("Introduzca importe:");
		//Almacenamos en la variable num
		imp=teclado.nextInt();
		impues=imp*0.019;
		//condicion
		if(imp<=100){
			descu=0.01*imp;
			imp=imp-descu;
			imptotal=imp+impues;
		}else{
			descu=0.02*imp;
			imp=imp-descu;
			imptotal=imp+impues;
		}
		System.out.println("El importe total es de: "+imptotal+"€ su descuento es de: "+descu+"€ y su impuesto es de: "+impues+"€");
	}

}