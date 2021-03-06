package ar.edu.unju.fi.model;

public class Candidato {

	private int codigo;
	private String nombre;
	private String generoMusical;
	private String descripcion;
	private int cantidadVotos;
	private String imagen;

	public Candidato(int codigo, String nombre, String generoMusical, String descripcion, int cantidadVotos, String imagen) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.generoMusical = generoMusical;
		this.descripcion = descripcion;
		this.cantidadVotos = cantidadVotos;
		this.imagen = imagen;
	}
	
	public Candidato() {
		super();
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGeneroMusical() {
		return generoMusical;
	}
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidadVotos() {
		return cantidadVotos;
	}
	public void setCantidadVotos(int cantidadVotos) {
		this.cantidadVotos = cantidadVotos;
	}
	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
}
