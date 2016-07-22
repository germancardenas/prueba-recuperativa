package cl.curso.java.prueba_tres.gcardenas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author German Cardenas
 *
 */
public class VecinoDAO {

	/**
	 * @param vecino
	 */
	public static void agregarVecino(Vecino vecino)
	{
		DataSingleton.getInstancia().getVecinos().add(vecino);
	}
	
	/**
	 * @param rut
	 * @return
	 */
	public static Vecino obtenerVecinoPorRut(String rut)
	{
	ArrayList<Vecino> vecinos=(ArrayList)DataSingleton.getInstancia().getVecinos();
	for (int i = 0; i < vecinos.size(); i++) {
		if(vecinos.get(i).getRut().equals(rut))
		{
			return vecinos.get(i);
		}
	}
	throw new NoEncontradoException("vecino no encontrado");
	}
	
	/**
	 * @return
	 */
	public static List<Vecino> ordenarPorNombre()
	{
		Collections.sort(DataSingleton.getInstancia().getVecinos());
		return DataSingleton.getInstancia().getVecinos();
	}
	
	/**
	 * @return
	 */
	public static List<Vecino> obtenerTodos()
	{
		return DataSingleton.getInstancia().getVecinos();
	}
	
}
