package edu.pingpong.DIP;

import edu.pingpong.DIP.bbdd.InventarioBBDD;
import edu.pingpong.DIP.negocio.ControladorEstoc;
import org.junit.Assert;
import org.junit.Test;

public class TestControladorEstoc {

	@Test
	public void test_control_estoc() {
		ControladorEstoc controlador = new ControladorEstoc(new InventarioBBDD());
		
		Assert.assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
		Assert.assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));

	}

}
