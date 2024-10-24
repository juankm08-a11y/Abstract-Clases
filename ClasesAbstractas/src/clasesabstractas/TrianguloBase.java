package clasesabstractas;

public abstract class TrianguloBase{
	public abstract double Perimetro();
	
	public int getAreaconHipotenusa(int lado,int hipotenusa) {
		int area = ( 1/2 * lado * hipotenusa);
		return area;
	}
}

