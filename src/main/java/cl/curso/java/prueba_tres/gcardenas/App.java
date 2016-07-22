package cl.curso.java.prueba_tres.gcardenas;

import java.util.ArrayList;
import java.util.Date;

/**
 * Hello world!
 *
 */
/**
 * @author German Cardenas
 *
 */
public class App {
	public static void main(String[] args) {
		Direccion direccionVecino1 = new Direccion("alonso de reinoso", "San Bernardo", "metropolitana", 14147, 1, 2);
		Vecino vecinoNumero1 = new Vecino("18497358-8", "german", "cardenas", new Date(), direccionVecino1, null);

		Vecino vecinoNumero2 = new Vecino("123-4", "alonso", "peres", new Date(), direccionVecino1, null);

		VecinoDAO.agregarVecino(vecinoNumero1);
		VecinoDAO.agregarVecino(vecinoNumero2);
		ArrayList<Vecino> vecinos = (ArrayList) VecinoDAO.obtenerTodos();

		

		String nombre = VecinoDAO.obtenerVecinoPorRut("18497358-8").getNombre();
		System.out.println(nombre);
		
		System.out.println(" - - - - - - - - - ");

		
		

		for (int i = 0; i < vecinos.size(); i++) {
			String string = vecinos.get(i).getNombre();
			System.out.println(string);
		}
		
		System.out.println(" - - - - - - - - - ");
		
		VecinoDAO.ordenarPorNombre();
		for (int i = 0; i < vecinos.size(); i++) {
			String string = vecinos.get(i).getNombre();
			System.out.println(string);
		}

	}
}
