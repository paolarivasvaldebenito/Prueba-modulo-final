package cajero;


import java.util.List;

public class Cliente {
	private String nombre;
	private String apellido;
	private String rut;
	private Cuenta cut;
	private List<String> registro;
	
	

	public Cliente(String nombre, String apellido, String rut, Cuenta cut) {
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

	public Cuenta getCut() {
		return cut;
	}

	public void setCut(Cuenta cut) {
		this.cut = cut;
	}

	public List<String> getRegistro() {
		return registro;
	}

	public void setRegistro(List<String> registro) {
		this.registro = registro;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", cut=" + cut + "]";
	}


	public String toString2() {
		return "Cliente [registro=" + registro + "]";
	}

	

}