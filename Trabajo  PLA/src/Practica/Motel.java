package Practica;

public class Motel extends Hotel{
	boolean albergue;

	public Motel(String nom,   String ciu,int est, Habitaci�n[] arrab, boolean pis, boolean alberg) {
		super(nom, ciu, est,pis, arrab); 	
		alberg=albergue;
	}

}
