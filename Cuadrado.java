public class Cuadrado {
	
	private String nombre;
	private double lado;

	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}
	
	public double calcularArea() {
		return Math.pow(2, getLado());
	}
	
	public double calcularPerimetro() {
		return 4*getLado();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}

	
	
}
