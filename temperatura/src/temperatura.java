import java.util.Scanner;
public class temperatura {

	public static void main(String[] args) {
		String clim; int vtemp;
		System.out.println("Introduce una temperatura:");
		Scanner teclado = new Scanner(System.in);
		vtemp=teclado.nextInt();
			if(vtemp<10){
				clim="Frio";
			}else if(vtemp>=10&&vtemp<=20){
				clim="Templado";
			}else if(vtemp>=21&&vtemp<=30){
				clim="Calor";
			}else{
				clim="Tropical";
			}
		System.out.println("El valor que has insertado es: "+vtemp+" Cº corresponde al clima: "+clim);
	}

}
