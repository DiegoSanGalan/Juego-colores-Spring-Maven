package clasesDTO;

public class Jugador {

	private String nombre;
	private String record;
	private int minutos;
	private int segundos;
	/**
	 * @param nombre
	 * @param record
	 * @param minutos
	 * @param segundos
	 */
	public Jugador(String nombre, String record, int minutos, int segundos) {
		super();
		this.nombre = nombre;
		this.record = record;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	/**
	 * 
	 */
	public Jugador() {
		
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the record
	 */
	public String getRecord() {
		return record;
	}
	/**
	 * @param record the record to set
	 */
	public void setRecord(String record) {
		this.record = record;
	}
	/**
	 * @param nombre
	 * @param record
	 */
	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}
	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}
	/**
	 * @param segundos the segundos to set
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	
	
	
}
