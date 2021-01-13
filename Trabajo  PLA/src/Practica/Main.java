package Practica;

import java.util.Scanner;
import java.io.*;
import Practica.Habitación;
import Practica.Hotel;
public class Main {

	public static void main(String[] args) {
		Habitación arrabs[] ={new Habitación (2, 50.75,2), new Habitación (2, 55.7,1), 
				new Habitación (4, 150.5,4), new Habitación (3, 80,2),  
				new Habitación (3, 100.25,2), new Habitación (1, 150,5), 
				new Habitación (2, 50.75,1), new Habitación (2, 93.25,4)};

		Hotel  arr[]= {new Hotel("NH","Madrid",4,true,arrabs), new Hotel("Alfonso  XII","Sevilla",3,false,arrabs),
				new Hotel("Serras","Barcelona",3,true,arrabs), new Hotel("Arts","Barcelona",4,true,arrabs),
				new Hotel("Mercer","Alicante",5,true,arrabs), new Hotel("Palace","Madrid",5,false,arrabs),
				new Hotel("Majestic","Palma",2,false,arrabs), new Hotel("Abadía","Valladolid",3,false,arrabs),
				new Hotel("Cortesin","Málaga",3,false,arrabs), new Hotel("María  Cristína","San Sebastián",4,true,arrabs)};

		Scanner entrada= new Scanner(System.in);
		int numero;
		String Hot;
		int estr;
		boolean pis;

		System.out.println("Elige el tipo de busqueda de hotel."+"\n"+"1.-Por nombre\n"+
				"2.-Por Ciudad\n"+"3.-Por Estrellas\n"+"4.-Por piscina\n"+"5.-Buscar motel");   
		numero=entrada.nextInt();
		switch(numero) {
		case  1: System.out.println("Introduce el nombre del Hotel que desea buscar\n");
		Hot=entrada.nextLine();
		Buscadornom(Hot,arr);
           
		break;
		case  2:System.out.println("Introduce la ciudad  del Hotel que desea buscar\n");
		Hot=entrada.nextLine();
		Buscadorciu (Hot,arr);
			break;
		case  3:System.out.println("Introduce el numero de estrellas del Hotel que desea buscar\n");
		estr=entrada.nextInt();
		Buscadorest (estr,arr);
			break;
		case  4:System.out.println("Introduce si desea que el hotel tenga piscina \n");
		pis=entrada.nextBoolean();
	    Buscadorpis (pis,arr);
			break;
		case 5:
			break;

		}
	}

	private static void Buscadorciu(String hot, Hotel[] arr) {
		// TODO Auto-generated method stub
		
	}

	private static Object Buscadorest(int estr, Hotel[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object Buscadorpis(boolean pis, Hotel[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void Buscadornom(String hot, Hotel[] arr) {
		// TODO Auto-generated method stub
		
	}
}
