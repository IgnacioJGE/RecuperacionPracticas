package Practica;

public class Habitaci�n {
	int camas;
	double precio;
	int planta;
	public int getCamas() {
		return camas;
	}

	public double getPrecio() {
		return precio;
	}

	public int getPlanta() {
		return planta;
	}
public  Habitaci�n(int cam,double pre, int plant) {
	camas=cam;
	precio=pre;
	planta=plant;
}
	public Habitaci�n Comparapre(Habitaci�n[] arrayhab) {
		Habitaci�n mej=new Habitaci�n(camas, precio, camas);
		double valor;
		for(int i =0;i<=arrayhab.length;i++) {
			((arrayhab[i].camas+arrayhab[i].planta/arrayhab[i].precio)<valor)? mej=arrayhab[i];
		}
		return mej;
		
	}

	

}
