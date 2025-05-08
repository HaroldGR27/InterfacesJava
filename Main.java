
public class Main {
	public static void main(String[] args) {
		Triangulo t1= new Triangulo("Bermudas",20,10,15);
		Triangulo t= new Triangulo("Triangulo T",200,100,150);
		Cuadrado c = new Cuadrado("Cuadrado",12);
		Rectangulo r=new Rectangulo("Rectangulo",2,5);
		Rombo rom=new Rombo("Rombo",11,22,33);
		Romboide romb=new Romboide("Romboide",23,24);
		Trapecio tr=new Trapecio("Trapecio",23,23,4,2);
		
		Main.imprimirCalculos(t1);
		Main.imprimirCalculos(t);
		Main.imprimirCalculos(c);
		Main.imprimirCalculos(r);
		Main.imprimirCalculos(rom);
		Main.imprimirCalculos(romb);
		Main.imprimirCalculos(tr);
	}
	
	public static void imprimirCalculos(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+------------------------------------------+");
		System.out.println("| El área de ["+t.getNombre()+"]");
		System.out.println("| es "+t.calcularArea());
		System.out.println("| El perimettro de ["+t.getNombre()+"]");
		System.out.println("| es "+t.calcularPerimetro());
		System.out.println("+------------------------------------------+");
	}
	
}
