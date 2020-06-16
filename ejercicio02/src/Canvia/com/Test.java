package Canvia.com;

import java.io.Console;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
	// Cantidad de elementos de un grupo

	private static int puntoLibro = 200;
	private static int puntoLibroPersonaLeopoldo = 8;
	private static int constanrandow = 100;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			List<Amigos> listAmigos = new ArrayList<Amigos>();
			List<Amigos> amigosPosibles = new ArrayList<Amigos>();
			Scanner in = new Scanner(System.in);
			int puntomascercano = 0;
			int distanciabuscar = puntoLibro - puntoLibroPersonaLeopoldo;
			System.out.println("Console Open");
			System.out.println("Ingrese la cantidad de Amigos");
			String cantidadAmigos = in.nextLine();
			System.out.println("La distancia de Leopoldo al libro es de  "+ puntoLibro );
			System.out.println("La Distancia que falta completar es ..  "+ distanciabuscar );
			System.out.println("-------------------------------------");
			System.out.println("---------------------------------");
			System.out.println("-------------------------------");
			int[] numeros = new int[Integer.parseInt(cantidadAmigos)];
			for (int i = 0; i < Integer.parseInt(cantidadAmigos); i++) {
				Amigos amig = new Amigos();
				Random ran = new Random();
				int randomNum = ran.nextInt(constanrandow);
				amig.setDistancia(randomNum);
				amig.setTiempo(2);
				amig.setNombre("Amigo" + i + "");
				numeros[i] = randomNum;
				listAmigos.add(amig);
			}
			 int contadoramigo=0;
			  for (Amigos i : listAmigos) {
				  System.out.println("Arreglo[" +contadoramigo+"] Distancia de cada amigo . "+ i.getDistancia());
				  contadoramigo++;
			  }
			puntomascercano = AmigomasCercano(numeros, distanciabuscar);
//			for (Amigos amigos : listAmigos) {
//				System.out.println("Distancia.." + amigos.getDistancia() + " Amigo " + amigos.getNombre());
//			}
			System.out.println("-------------------------------------");
			System.out.println("---------------------------------");
			System.out.println("-------------------------------");
			System.out.println("Pedir ayuda a los amigos con distancia a.." +puntomascercano+"");
		} catch (Exception e) {
			throw e;
		}

	}
	public static int AmigomasCercano(int[] numeros, int num) {
		int cercano = 0;
		int diferencia = Integer.MAX_VALUE;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) {
				return numeros[i];
			} else {
				if (Math.abs(numeros[i] - num) < diferencia) {
					cercano = numeros[i];
					diferencia = Math.abs(numeros[i] - num);
				}
			}
		}
		return cercano;
	}

}
