
public class Main {
	public static void main(String[] args) {
		Triangulo t1= new Triangulo("Bermudas",20,10,15);
		Triangulo t= new Triangulo("Triangulo T",200,100,150);
		Cuadrado c = new Cuadrado("Cuadrado",12);

		Main.imprimirCalculos(t1);
		Main.imprimirCalculos(t);
		Main.imprimirCalculos(c);
	}
	
	public static void imprimirCalculos(Triangulo t) {
		System.out.println(t);
		System.out.println("+------------------------------------------+");
		System.out.println("| El área de ["+t.getNombre()+"]");
		System.out.println("| es "+t.calcularArea());
		System.out.println("| El perimettro de ["+t.getNombre()+"]");
		System.out.println("| es "+t.calcularPerimetro());
		System.out.println("+------------------------------------------+");
	}
	
}
