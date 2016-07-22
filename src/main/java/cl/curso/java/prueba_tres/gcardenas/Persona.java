package cl.curso.java.prueba_tres.gcardenas;

import java.util.Date;

/**
 * @author German Cardenas
 *
 */
public class Persona {

	private String rut;
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	
	/**
	 * 
	 */
	public Persona() 
	{
		
	}
	
	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param fechaDeNacimiento
	 */
	public Persona(String rut, String nombre, String apellido, Date fechaDeNacimiento) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	/**
	 * @return
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return
	 */
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	/**
	 * @param fechaDeNacimiento
	 */
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
}
