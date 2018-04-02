package tests;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import paquete.listaInt;

public class listaIntTest extends TestCase {
		private int vEsperado=7;
	    @Test
	    public void testDesorden() {
	        assertEquals(vEsperado,listaInt.obtenMayorNumero(new int[]{1,3,5,7}));
	        assertEquals(vEsperado,listaInt.obtenMayorNumero(new int[]{7,5,3,1}));
	        assertEquals(vEsperado,listaInt.obtenMayorNumero(new int[]{1,7,5,3}));
	        assertEquals(vEsperado,listaInt.obtenMayorNumero(new int[]{1,3,7,5}));
	    }
	    @Test
	    public void testRepes() {
	        assertEquals(vEsperado,listaInt.obtenMayorNumero(new int[]{7,7,1,3}));
	    }	
	    @Test
	    public void testUnElemento() {
	        assertEquals(vEsperado,listaInt.obtenMayorNumero(new int[]{7}));
	    }
	    @Test
	    public void testNegativos() {
	        assertEquals(vEsperado,listaInt.obtenMayorNumero(new int[]{-1,3,-5,7,-9}));
	    }
}

