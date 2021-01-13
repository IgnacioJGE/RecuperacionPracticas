package Practica;

public class Hotel {

	protected String nombre;
	protected String ciudad;
	protected  int estrellas;
	protected boolean piscina;
	protected Habitación arrayhab[];

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public Habitación[] getArrayhab() {
		return arrayhab;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public boolean isPiscina() {
		return piscina;
	}
	public Hotel (String nom,   String ciu,int est, boolean pis,  Habitación[] arrab) {
		nombre=nom;
		ciudad=ciu;
		estrellas=est;
		piscina=pis;
		arrayhab=arrab;

	}
	public Hotel Bucadornom (String nombre , Hotel[] hotelarr) {

		for(int i =0;i<=hotelarr.length;i++) {
			if(hotelarr[i].nombre==nombre) {
				return hotelarr[i];
			}
		}

		return null;

	}

	public Hotel[] Buscadorciu (String ciudad, Hotel[] hotelarr) {
		Hotel arrayh[]=new Hotel[5];
		int u=0;
		for(int i =0;i<=hotelarr.length;i++) {
			if(hotelarr[i].ciudad==ciudad) {
				arrayh[u]=hotelarr[i];
				u++;
			}

		}
		return arrayh;

	}

	public Hotel[] Buscadorest (int estr, Hotel[] hotelarr) {
		Hotel arrayh[]=new Hotel[5];
		int u=0;
		for(int i =0;i<=hotelarr.length;i++) {
			if(hotelarr[i].estrellas==estr) {
				arrayh[u]=hotelarr[i];
				u++;
			}
		}
		return arrayh;

	}
	public Hotel[] Buscadorpis (boolean pis, Hotel[] hotelarr) {
		Hotel arrayh[]=new Hotel[5];
		int u=0;
		for(int i =0;i<=hotelarr.length;i++) {
			if(hotelarr[i].piscina==pis) {
				arrayh[u]=hotelarr[i];
				u++;
			}
		}
		return arrayh;

	}


}
