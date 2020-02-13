package cajero;

import java.util.List;

public class Cliente{

	private String nombre;
	private String apellido;
	private String rut;
	private List<Cuenta> cut;
	
	public Cliente(String nombre, String apellido, String rut, List<Cuenta> cut) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.cut = cut;
	}
	public Cliente() {
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public List<Cuenta> getCut() {
		return cut;
	}
	public void setCut(List<Cuenta> cut) {
		this.cut = cut;
	}

	
	
	

}
