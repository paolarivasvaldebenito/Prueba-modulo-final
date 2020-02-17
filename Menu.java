package menu;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import cajero.Cliente;
import cajero.Cuenta;
import cajero.Cuenta.Tipo;

public class Menu {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		int op1, op2, op3, op4;
		String pass1, user1, pass2, user2;
		String a1, a2, a3, a4;
		String clave;
		int saldo;
		int cuenta;
		int tipo_cuenta;
		boolean seguir = false;
		int x = 0;
		boolean continuar = false;
		int[][] ultomosMovimientos = new int[10][4];
		List<Cliente> c1 = new LinkedList<Cliente>();

		/**
		 * datos de pruebas
		 */
		Cuenta m0 = new Cuenta();
		m0.setClave("12345");
		m0.setSaldo(123000);
		m0.setTipo(Tipo.vista);

		Cuenta m1 = new Cuenta();
		m1.setClave("12345");
		m1.setSaldo(800000);
		m1.setTipo(Tipo.vista);

		Cuenta m2 = new Cuenta();
		m2.setClave("12345");
		m2.setSaldo(900000);
		m2.setTipo(Tipo.vista);

		Cuenta m3 = new Cuenta();
		m3.setClave("12345");
		m3.setSaldo(123000);
		m3.setTipo(Tipo.vista);

		Cliente x1 = new Cliente();
		x1.setNombre("Mario");
		x1.setApellido("soto");
		x1.setRut("1698000k");
		x1.setCut(m0);

		Cliente x2 = new Cliente();
		x2.setNombre("juan");
		x2.setApellido("cardenas");
		x2.setRut("14987641");
		x2.setCut(m1);

		Cliente x3 = new Cliente();
		x3.setNombre("pamela");
		x3.setApellido("urrutia");
		x3.setRut("17569222k");
		x3.setCut(m2);

		Cliente x4 = new Cliente();
		x4.setNombre("Paula");
		x4.setApellido("martinez");
		x4.setRut("16670857k");
		x4.setCut(m3);

		c1.add(x1);
		c1.add(x2);
		c1.add(x3);
		c1.add(x4);

		/**
		 * 
		 */
		boolean creada = false;

		while (!continuar) {
			System.out.println("|	**************Menu principal**************	|");
			System.out.println("	1.-Administrador");
			System.out.println("	2.-Cliente");
			System.out.println("	3.-Salir");
			op1 = a.nextInt();
			do {

				switch (op1) {
				case 1:
					System.out.println("\n**************Credenciales Adminostrador**************	:");
					System.out.println("Ingresar contraseña de administrador");
					pass1 = a.next();

					if (!pass1.equals("root")) {
						System.out.println("La contraseña esta errada");
						main(args);
					} else {
						System.out.println("|	**************Menu Administrador**************	|");

						System.out.println("	1.-Crear cliente");

						System.out.println("	2.-Mostrar cliente");

						System.out.println("    3.-salir           ");
						op2 = a.nextInt();

						do {

							switch (op2) {
							case 1:
								System.out.println("creando cliente............");
//								while (!seguir) {
//									Cliente c0 = new Cliente();
//									Cuenta q0 = new Cuenta();
//
//									System.out.println("Ingrese nombre:");
//									a1 = a.next();
//									c0.setNombre(a1);
//
//									System.out.println("Ingrese apellido:");
//									a2 = a.next();
//									c0.setApellido(a2);
//
//									System.out.println("Ingrese rut:");
//									a3 = a.next();
//									c0.setRut(a3);
//
//									/**
//									 * Ingreso de cuenta
//									 */
//
//									do {
//										System.out.println("Ingrese tipo de cuenta:");
//										System.out.println("1) Ahorro:");
//										System.out.println("2) corriente:");
//										System.out.println("3) Vista:");
//
//										tipo_cuenta = a.nextInt();
//
//										switch (tipo_cuenta) {
//										case 1:
//											q0.setTipo(Tipo.ahorro);
//											break;
//										case 2:
//											q0.setTipo(Tipo.corriente);
//											break;
//										case 3:
//											q0.setTipo(Tipo.vista);
//											break;
//										}
//
//									} while (tipo_cuenta < 1 || tipo_cuenta > 3);
//
//									// 2)
//
//									System.out.println("Ingrese clave:");
//									clave = a.next();
//									q0.setClave(clave);
//
//									System.out.println("Ingrese saldo:");
//									saldo = a.nextInt();
//									q0.setSaldo(saldo);
//
//									System.out.println("Desea ingresar otra cuenta:");
//									System.out.println("1) SI");
//									System.out.println("2) NO");
//									do {
//										cuenta = a.nextInt();
//										if (cuenta == 2) {
//											seguir = true;
//										}
//									} while (cuenta < 1 || cuenta > 2);
//									// q1.add(q0);
//									c0.setCut(q0);
								break;
							case 2:
								System.out.println("\nmostrar cliente:");
								for (Cliente cliente : c1) {
									System.out.println(cliente);
								}
								break;
							case 3:
								// continuar = true;
								System.out.println(" adios");
								break;
							}

						} while (op1 < 1 && op1 > 3);
					}

					break;
				case 2:

					System.out.println("\n**************Credenciales Usuario**************	:");

					System.out.println("Ingresar el rut del usuario:");
					pass2 = a.next();

					System.out.println("Ingresar la contraseña del usuario:");
					user2 = a.next();

					for (int i = 0; i < c1.size(); i++) {
//		System.out.println(c1.get(i).getRut());
//		System.out.println(c1.get(i).getCut().getClave());
//		System.out.println(c1.get(i).getCut().getSaldo());

						if (pass2.equalsIgnoreCase(c1.get(i).getRut())
								&& user2.equalsIgnoreCase(c1.get(i).getCut().getClave())) {

							System.out.println("|	**************Menu Usuario**************	|");

							System.out.println("	1.-Abonar");

							System.out.println("	2.-Retirar");

							System.out.println("	3.-Consulta de Saldo");

							System.out.println("	4.-Cambio de clave");

							System.out.println("	5.-Ver ultimos movimientos");

							System.out.println("	6.-Salir");
							op2 = a.nextInt();
							do {
								/**
								 * variables locales
								 */
								int abono, retirar, opcionClave, abonoFinal = 0;
								int saldoRetirar = 0;
								String claveFinal;

								switch (op2) {
								case 1:
									System.out.println("Abonar");

									System.out.println("Ingresar el monto a abonar:");
									abono = a.nextInt();
									if (abono < 0) {
										abono = 0;
									}
//										abonoFinal = c1.get(i).getCut().getCuenta() + abono;
//										c1.get(i).getCut().setSaldo(abonoFinal);

									System.out.println(
											"finalmente su saldo es :" + ((c1.get(i).getCut().getSaldo()) - abono));

									break;
								case 2:
									System.out.println("Retirar");

									System.out.println("Ingresar el monto a retirar:");
									retirar = a.nextInt();

									if (c1.get(i).getCut().getSaldo() > retirar) {
										System.out.println(
												"finalmente su saldo es $" + ((c1.get(i).getCut().getSaldo()) - retirar)
														+ " ya que ha retirado de su cuenta $" + retirar);
										saldoRetirar = (int) ((c1.get(i).getCut().getSaldo()) - retirar);
										c1.get(i).getCut().setSaldo(saldoRetirar);

									} else {
										System.out.println("Su monto a retirar es mayor a lo que tiene :(");
									}

									break;
								case 3:

									System.out.println(" Consulta de Saldo");

									System.out.println("Su saldo es $" + c1.get(i).getCut().getSaldo());
									break;
								case 4:

									System.out.println(" Cambio de clave");

									System.out.println("¿Esta seguro que desea cambiar su clave?");
									System.out.println("1- SI");
									System.out.println("2- NO");
									opcionClave = a.nextInt();
									if (opcionClave == 1) {
										System.out.println("Ingrese su clave:");
										claveFinal = a.next();

										c1.get(i).getCut().setClave(claveFinal);

										System.out.println("Finalmente su clave ha sido cambiada");
									} else {
										main(args);
									}

									break;
								case 5:

									System.out.println(" Ver ultimos movimientos");

									break;
								case 6:

									System.out.println(" adios");
									break;
								}

							} while (op1 < 1 && op1 > 6);

							creada = true;
						}
						if (creada == false) {
							System.out.println("el usuario no esta creado!!");
						}
					}

					break;
				case 3:
					continuar = true;
					System.out.println(" adios");
					break;
				}
			} while (op1 < 1 && op1 > 3);

		}

	}

}