package ejercicios;

public class CodigoLimpio {



    // Atributos

    private int codigo;
    private String nombre;
    private String categoria;
    private double x;
    private boolean disponible;

    // Constructor predeterminado

    public CodigoLimpio() {
        this.codigo = 0;
        this.nombre = "";
        this.categoria = "";
        this.x = 0;
        this.disponible = true;
    }

    // Constructor con codigo

    public CodigoLimpio(int codigo) {
        this.codigo = codigo;
        this.nombre = "";
        this.categoria = "";
        this.x = 0;
        this.disponible = true;
    }

    // Constructor completo

    public CodigoLimpio(int codigo, String nombre,
            String categoria, double x, boolean disponible) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.x = x;
        this.disponible = disponible;
    }

    // Getters y setters

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Calcular precio con IVA

    public double calcularPrecio() {
        return this.x + (this.x * 0.10);
    }

    // Mostrar informacion basica

    public void println() {
        System.out.println("Producto: " + this.nombre);
        System.out.println("Categoria: " + this.categoria);
    }

    // Mostrar toda la informacion

    public void printAll() {

        System.out.println("Codigo: " + this.codigo);
        System.out.println("Producto: " + this.nombre);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Precio sin IVA: " + this.x);
        System.out.println("Disponible: " + this.disponible);
        System.out.println("Precio con IVA: " + this.calcularPrecio() + " euros");

    }   
    }

	


