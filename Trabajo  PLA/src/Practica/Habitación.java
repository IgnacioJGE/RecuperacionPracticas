package Practica;

public class Habitación {
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
public  Habitación(int cam,double pre, int plant) {
	camas=cam;
	precio=pre;
	planta=plant;
}
	public Habitación Comparapre(Habitación[] arrayhab) {
		Habitación mej=new Habitación(camas, precio, camas);
		double valor;
		for(int i =0;i<=arrayhab.length;i++) {
			((arrayhab[i].camas+arrayhab[i].planta/arrayhab[i].precio)<valor)? mej=arrayhab[i];
		}
		return mej;
		
	}

	

}
