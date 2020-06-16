package Canvia.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
	// Cantidad de elementos de un grupo

	private static int constanrandow = 2;// Numero aleatorios a formar
	private static String constanY = "Y";// Jefes notacion de Y
	private static String constanN = "N";// Subordinados notacion N

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			List<String> listColoboradore = new ArrayList<String>();
			;
			List<Empleados> listemp = new ArrayList<Empleados>();
			int cantidadDeElementosXGrupo = 8;
			// aleatoriamente;
			int cantidadColoborares;
			// Cantidad de grupos formados el forzamos a que sean enteros con int
			System.out.println("Console Open");
			System.out.println("Ingrese la cantidad de colaboradores de la Compañia");
			String Input = in.nextLine();
			System.out.println("Ingrese la cantidad de grupos a Crear");
			cantidadDeElementosXGrupo = Integer.parseInt(in.nextLine());
			cantidadColoborares = Integer.parseInt((Input));
			int cantidadGrupos = (cantidadColoborares / cantidadDeElementosXGrupo);
			for (int i = 0; i < cantidadGrupos; i++) {
				int cantidad = 0;
				Empleados emp = new Empleados();
				for (int j = 0; j < cantidadDeElementosXGrupo; j++) {
					Random ran = new Random();
					int randomNum = ran.nextInt(constanrandow);
					if (randomNum == 1) {
						listColoboradore.add(constanY);
						cantidad = cantidad + 1;
					} else {
						listColoboradore.add(constanN);
					}
				}
				String str = listColoboradore.stream().collect(Collectors.joining());
				emp.setCantidad(cantidad);
				emp.setListCaracter(listColoboradore);
				emp.setCaracter(str);
				listColoboradore.clear();
				listemp.add(emp);
			}
			System.out.println("Cantidad de Grupo Formados de " + cantidadDeElementosXGrupo + " elementos = a .."
					+ cantidadGrupos + " grupos");
			System.out.println("-----------------------------------------");
			System.out.println("-------------------------------------");
			System.out.println("---------------------------------");
			System.out.println("-------------------------------");
			int cuentaarr = 0;
			for (Empleados empleados : listemp) {
				System.out.println("Arrelo[" + cuentaarr + "] Secuencia creada[" + empleados.getCaracter()
						+ "] Cantidad de Jefes por elemento =>" + empleados.getCantidad());
				cuentaarr = cuentaarr + 1;
			}
			List<Empleados> sortedUsers = listemp.stream().sorted(Comparator.comparing(Empleados::getCantidad))
					.collect(Collectors.toList());
			System.out.println("-------------------------------");
			System.out.println("Arreglo en forma ascendente a la cantidad de jefes de un grupo");

			int crearIndice = 0;
			List<Empleados> listempindice = new ArrayList<Empleados>();
			for (Empleados empleados : sortedUsers) {
				empleados.setIndice(crearIndice);
				listempindice.add(empleados);
				crearIndice = crearIndice + 1;
			}
			System.out.println("---------------------------------");

			for (Empleados empleados : listempindice) {
				System.out.println("Indice[" + empleados.getIndice() + "] Secuencia[" + empleados.getCaracter()
						+ "] jefes " + empleados.getCantidad());
			}
			System.out.println("-------------------------------");
			int contasueldo = 0;
			List<Empleados> CalculaSueldo = new ArrayList<Empleados>();
			for (Empleados empleados : listempindice) {
				int sueldo = 0;
				Empleados empleadoss = new Empleados();
				empleadoss.setCantidad(empleados.getCantidad());
				empleadoss.setCaracter((empleados.getCaracter()));
				empleadoss.setIndice((empleados.getIndice()));
				if (empleados.getIndice() == 0) {
					empleadoss.setSueldo(1);
				}
				if (contasueldo > 0) {
					if (listempindice.get(contasueldo).getCantidad() != listempindice.get(contasueldo - 1)
							.getCantidad()) {
						for (int i = contasueldo; i > 0; i--) {
							if (listempindice.get(i).getCantidad() != listempindice.get(i - 1).getCantidad()) {
								sueldo = sueldo + 1;
							}
							empleadoss.setSueldo(sueldo);
						}

					}
				}
				contasueldo = contasueldo + 1;
				CalculaSueldo.add(empleadoss);
			}
			int totalsueldo = 0;
			for (Empleados empleados : CalculaSueldo) {

				totalsueldo = totalsueldo + empleados.getSueldo();

			}
			System.out.println("La cantidad de sueldo de todos los empleados= " + totalsueldo + " ./s");

		} catch (Exception e) {
			throw e;
		}

	}

}
