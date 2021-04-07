package edu.pingpong.DIP.negocio;


import edu.pingpong.DIP.bbdd.InventarioInter;

public class ControladorEstoc  implements ControladorInven{

	private final InventarioInter inventario;
	
	public ControladorEstoc(InventarioInter inventario) {
		this.inventario = inventario;
	}

	@Override
	public boolean necesitaReponer (String tienda, String producto) {
		int cantidadActual = inventario.numeroProductos(tienda, producto);
		return  cantidadActual < producto.length() * 100;
	}

}
