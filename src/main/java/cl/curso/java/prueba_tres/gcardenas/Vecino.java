package cl.curso.java.prueba_tres.gcardenas;

import java.util.Date;
import java.util.List;

/**
 * @author German Cardenas
 *
 */
public class Vecino extends Persona implements Comparable<Vecino>{

	private Direccion direccion;
	private List<Vecino> vecinos;
	
	/**
	 * 
	 */
	public Vecino() 
	{
		
	}
	
	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param fechaDeNacimiento
	 * @param direccion
	 * @param vecinos
	 */
	public Vecino(String rut, String nombre, String apellido, Date fechaDeNacimiento,Direccion direccion,List<Vecino>vecinos) {
		super(rut, nombre, apellido, fechaDeNacimiento);
		this.direccion=direccion;
		this.vecinos=vecinos;
	}

	/**
	 * @return
	 */
	public Direccion getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
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
	public void setVecinos(List<Vecino> vecinos) {
		this.vecinos = vecinos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Vecino o) {
		return this.getNombre().compareTo(o.getNombre());
	}
	
	
}
