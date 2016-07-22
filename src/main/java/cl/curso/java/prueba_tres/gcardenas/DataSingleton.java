package cl.curso.java.prueba_tres.gcardenas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author German Cardenas
 *
 */
public class DataSingleton {

	private static List<Vecino> vecinos;
	private static DataSingleton instancia;
	
	/**
	 * @return
	 */
	public static DataSingleton getInstancia()
	{
		if(null==instancia)
		{
			instancia=new DataSingleton();
			vecinos=new ArrayList();
		}
		return instancia;		
	}

	/**
	 * @return
	 */
	public List<Vecino> getVecinos() {
		return vecinos;
	}

	/**
	 * @param vecinos
	 */
	public void setVecinos(List<Vecino> vecinos) { this.vecinos = vecinos;
	}
	
	
	
}
