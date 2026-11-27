package ejercicios;

public class CodigoLimpio {
	//Atributos
	private int codigo;
	private String nombre;
	private String categoria;
	private String x;
	private boolean disponible;
	
	//Constructor
	public CodigoLimpio() {
	this.codigo=0;
	this.nombre="";
	this.categoria="";
	this.x="0";
	this.disponible=true;
	}
	//Constructor con codigo
	public CodigoLimpio(int codigo) {
		this.codigo=codigo;
		this.nombre="";
		this.categoria="";
		this.x="0";
		this.disponible=true;
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}	
	
	
}

