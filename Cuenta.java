package cajero;

public class Cuenta {
	@SuppressWarnings("unused")
	private int cuenta;
	private Tipo tipo;
	private String clave;
	private long saldo;

	public enum Tipo {
		ahorro, corriente, vista
	}

	public Cuenta() {
		this.saldo = 0;
		this.cuenta = (int) (Math.random() * 2000000) + 1;

	}

	public Cuenta(Tipo tipo, String clave, long saldo) {
		this.tipo = tipo;
		this.clave = clave;
		this.saldo = saldo;
	}

	
	public int getCuenta() {
		return cuenta;
	}


	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

//	public void abonar() {
//
//	}
//
//	public void retirar() {
//
//	}
//
//	public void consultar_saldo() {
//
//	}
//
//	public void cambiarClave() {
//
//	}
	
//	public void ver_ultimos_movimientos() {
//
//	}

	@Override
	public String toString() {
		return "Cuenta [cuenta=" + cuenta + ", tipo=" + tipo + ", clave=" + clave + ", saldo=" + saldo + "]";
	}


}