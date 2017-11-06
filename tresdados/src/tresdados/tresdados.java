package tresdados;
import java.util.Random;

public class tresdados {

	public static void main(String[] args) {
		// Declaración de la variable contador de aciertos (cont) y de los tres dados: d1,d2,d3 y 
		int cont=0;int d1,d2,d3;
		//comando random (aleatoriedad)
		Random aleatorio = new Random();
		//Entrada de datos aleatorios a las variables* y condiciones.
		//* Se introduce en el nextInt que puede llegar hasta 6 y como minimo 1 (por eso +1 sino podria dar lugar a un valor 0);
		d1 = aleatorio.nextInt(6)+1;
		if(d1==6) {
			cont=cont+1;
		}
		d2 = aleatorio.nextInt(6)+1;
		if(d2==6) {
			cont=cont+1;
		}
		d3 = aleatorio.nextInt(6)+1;
		if(d3==6) {
			cont=cont+1;
		}
		//condiciones anidadas donde se decide el premio que ha sido almacenado en la variable cont anteriormente.
		if(cont==3) {
			System.out.println("Premio de oro! Enhorabuena! los dados que lanzaste son: "+d1+","+d2+","+d3);
		}
		else {
			if(cont==2) {
				System.out.println("Premio de plata! Enhorabuena! los dados que lanzaste son: "+d1+","+d2+","+d3);
			}
			else {
				if(cont==1) {
					System.out.println("Premio de Bronce! No esta mal! los dados que lanzaste son: "+d1+","+d2+","+d3);
				}
				else {
					System.out.println("Perdedor! No sacaste ningún 6, que mala suerte! los dados que lanzaste son: "+d1+","+d2+","+d3);
				}
				
			}
		}

	}
	
}
