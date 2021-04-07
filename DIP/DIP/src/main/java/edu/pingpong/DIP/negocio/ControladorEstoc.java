package edu.pingpong.DIP.negocio;


import edu.pingpong.DIP.bbdd.InventarioBBDD;

public class ControladorEstoc  implements ControladorInven{

	private final InventarioBBDD inventario;
	
	public ControladorEstoc(InventarioBBDD inventario) {
		this.inventario = inventario;
	}

	@Override
	public boolean necesitaReponer (String tienda, String producto) {
		int cantidadActual = inventario.numeroProductos(tienda, producto);
		
		return  cantidadActual < producto.length() * 100;
	}

}
