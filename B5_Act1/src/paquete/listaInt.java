package paquete;

public class listaInt {
	
	public static int obtenMayorNumero(int lista[]){
		int ext=lista.length;
		int esMayor = lista[0];//Escojo uno al azar.
		for(int i=1; i < ext;i++){
			if(lista[i] > esMayor){//Si el seleccionado es mayor que el escogido anteriormente, cambialo.
				esMayor = lista[i];
			}
		}
		return esMayor;//Devolverá el mayor de todos.
	}
}

