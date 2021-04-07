package edu.pingpong.DIP.bbdd;


public class InventarioBBDD implements InventarioInter{


	// Metodo de consulta a la base de datos
	@Override
	public int numeroProductos(String tienda, String producto) {
		return BBDD.stocs.get(tienda).get(producto);
	}
}
