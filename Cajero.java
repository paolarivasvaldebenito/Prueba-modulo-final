package cajero;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import cajero.Cuenta.Tipo;

public class Cajero {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		String a1, a2, a3, a4;
		String clave;
		int saldo;
		int cuenta;
		int tipo_cuenta;
		boolean seguir = false;

//		private String nombre;
//		private String apellido;
//		private String rut;
//		private List<Cuenta> cut;

//		private String tipo;
//		private String clave;
//		private long saldo;

		// !)
		List<Cliente> c1 = new LinkedList<Cliente>();
		List<Cuenta> q1 = new LinkedList<Cuenta>();

		Cliente c0 = new Cliente();
		Cuenta q0 = new Cuenta();

		System.out.println("Ingrese nombre:");
		a1 = a.next();
		c0.setNombre(a1);

		System.out.println("Ingrese apellido:");
		a2 = a.next();
		c0.setNombre(a2);

		System.out.println("Ingrese rut:");
		a3 = a.next();
		c0.setNombre(a3);

		/**
		 * Ingreso de cuenta
		 */
		while (!seguir) {

			do {
				System.out.println("Ingrese tipo de cuenta:");
				System.out.println("1) Ahorro:");
				System.out.println("2) corriente:");
				System.out.println("3) Vista:");

				tipo_cuenta = a.nextInt();

				switch (tipo_cuenta) {
				case 1:
					q0.setTipo(Tipo.ahorro);
					break;
				case 2:
					q0.setTipo(Tipo.corriente);
					break;
				case 3:
					q0.setTipo(Tipo.vista);
					break;
				}

			} while (tipo_cuenta < 1 || tipo_cuenta > 3);

			// 2)

			System.out.println("Ingrese clave:");
			clave = a.next();
			q0.setClave(clave);

			System.out.println("Ingrese saldo:");
			saldo = a.nextInt();
			q0.setSaldo(saldo);
			
			
			System.out.println("Desea ingresar otra cuenta:");
			System.out.println("1) SI");
			System.out.println("2) NO");
			do {
				cuenta = a.nextInt();
				if (cuenta == 2) {
					seguir = true;
				}
			} while (cuenta < 1 || cuenta > 2);
		}

		

		
		q1.add(q0);
		c0.setCut(q1);
	}

}
