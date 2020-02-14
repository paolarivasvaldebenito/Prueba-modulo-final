package cajero;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		int op1, op2, op3, op4;
		boolean continuar = false;
		final String clave="root";

		while (!continuar) {
			System.out.println("|	**************Menu principal**************	|");
			System.out.println("	1.-Administrador");
			System.out.println("	2.-Cliente");
			System.out.println("	3.-Salir");
			op1 = a.nextInt();
			do {

				switch (op1) {
				case 1:
					// System.out.println("Ingresar contraseña de administrador");
					clave = a.nextInt();

					if (clave != 12345) {
						
					}
					else {
						System.out.println("|	**************Menu Administrador**************	|");

						System.out.println("	1.-Crear cliente");

						System.out.println("	2.-Mostrar cliente");

						System.out.println("    3.-salir           ");
						op2 = a.nextInt();
						do {

							switch (op2) {
							case 1:
								System.out.println("creando cliente");
								break;
							case 2:
								System.out.println("mostrar cliente");
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
					System.out.println(" cliente");
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
