package clasesabstractas;

public class Acutangulo extends TrianguloBase{
	private int lado1, lado2, hipotenusa;
	
	
	public Acutangulo(int lado1, int lado2, int hipotenusa) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.hipotenusa = hipotenusa;
	}
	
	@Override
	public double Perimetro() {
		return lado1+lado2+hipotenusa;
	}

}


