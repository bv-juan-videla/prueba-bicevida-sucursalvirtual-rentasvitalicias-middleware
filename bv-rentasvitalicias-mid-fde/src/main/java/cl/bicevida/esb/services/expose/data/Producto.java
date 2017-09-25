package cl.bicevida.esb.services.expose.data;

public class Producto {
	
	private String nombreProducto;
	private Long npoliza;
	private Long ramo;
	
	public Producto(){
		
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Long getNpoliza() {
		return npoliza;
	}
	public void setNpoliza(Long npoliza) {
		this.npoliza = npoliza;
	}
	public Long getRamo() {
		return ramo;
	}
	public void setRamo(Long ramo) {
		this.ramo = ramo;
	}
	
}
