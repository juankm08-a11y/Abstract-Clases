package clasesabstractas;

public class Instancia {
	public static void main(String[] args) {
		Escaleno escaleno = new Escaleno(1,2,3);
		System.out.println("El perimetro del triangulo escaleno es: "+ escaleno.Perimetro());
		System.out.println("El Area del triangulo escaleno es: "+ escaleno.getAreaconHipotenusa(1,3));
	
		Acutangulo acutangulo = new Acutangulo(1,2,3);
		System.out.println("El perimetro del triangulo acutangulo es: "+ acutangulo.Perimetro());
		System.out.println("El Area del triangulo acutangulo es: "+ acutangulo.getAreaconHipotenusa(1,3));
	}
}