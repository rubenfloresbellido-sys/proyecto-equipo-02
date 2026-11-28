package ejercicioss;

public class CodigoLimpio_ruben {
	//Atributos
	private int codigo;
	private String nombre;
	private int cantidad;
	private String categoria;
	private static double IVA;
	private boolean disponible=false;
	private double precioProducto;
	
	//Constructor
	public CodigoLimpio_ruben() {
	this.codigo=0;
	this.nombre="";
	this.categoria="";
	this.precioProducto=0;
	}
	
	//Constructor con codigo
	public CodigoLimpio_ruben(String nombre, int cantidad, double precioProducto) {
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.precioProducto=precioProducto;
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
	
	public static double getX() {
		return IVA;
	}

	public static void setX(double IVA) {
		CodigoLimpio_ruben.IVA = IVA;
	}

	
	public static double getIVA() {
		return IVA;
	}

	public static void setIVA(double iVA) {
		IVA = iVA;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	//Método que vea si está disponible
	public Boolean ProductoDisponible () {
		if (cantidad<=0) {
			disponible=false;
		}else {
			disponible=true;
		}
		return (disponible);
	}

	public double calcularIVA  () {
		return (precioProducto*=IVA/100);
	}
	
	public String toString () {
		
		
		return "===========================\n"
				+          "MENÚ\n"         
				+"==========================\n"
				+"\n"
				+"Productos:"+nombre+   +precioProducto+"\n";
	}
}

