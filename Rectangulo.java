
public class Rectangulo implements FiguraGeometrica{
	private String nombre;
	private double altura;
	private double base;
	
	public Rectangulo(String nombre,double base, double altura) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.base = base;
	}
	
	public double calcularArea() {
		return getBase()*getAltura();
	}
	
	public double calcularPerimetro() {
		return (2*getBase())+(2*getAltura());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Rectangulo [nombre=" + nombre + ", altura=" + altura + ", base=" + base + "]";
	}
	
}
