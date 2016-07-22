package cl.curso.java.prueba_tres.gcardenas;

/**
 * @author German Cardenas
 *
 */
public class Direccion {

	private String calle;
	private String comuna;
	private String region;
	private int numero;
	private double latitud;
	private double longitud;
	
	/**
	 * 
	 */
	public Direccion() 
	{
	}
	
	/**
	 * @param calle
	 * @param comuna
	 * @param region
	 * @param numero
	 * @param latitud
	 * @param longitud
	 */
	public Direccion(String calle, String comuna, String region, int numero, double latitud, double longitud) {
		super();
		this.calle = calle;
		this.comuna = comuna;
		this.region = region;
		this.numero = numero;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	/**
	 * @return
	 */
	String getCalle() {
		return calle;
	}
	/**
	 * @param calle
	 */
	void setCalle(String calle) {
		this.calle = calle;
	}
	/**
	 * @return
	 */
	String getComuna() {
		return comuna;
	}
	/**
	 * @param comuna
	 */
	void setComuna(String comuna) {
		this.comuna = comuna;
	}
	/**
	 * @return
	 */
	String getRegion() {
		return region;
	}
	/**
	 * @param region
	 */
	void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return
	 */
	int getNumero() {
		return numero;
	}
	/**
	 * @param numero
	 */
	void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return
	 */
	double getLatitud() {
		return latitud;
	}
	/**
	 * @param latitud
	 */
	void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	/**
	 * @return
	 */
	double getLongitud() {
		return longitud;
	}
	/**
	 * @param longitud
	 */
	void setLongitud(double longitud) {
		this.longitud = longitud;
	}
}
