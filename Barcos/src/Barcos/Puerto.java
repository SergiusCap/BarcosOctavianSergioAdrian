package Barcos;

import java.util.ArrayList;
import Barcos.Barco;
public class Puerto {
	protected ArrayList<Barco> lista;

	public Puerto(ArrayList<Barco> lista) {
		super();
		this.lista = new ArrayList<Barco>();
	}
	
	public boolean entrarBarco(Barco b) {
		lista.add(b);
		return true;
	}
	
	public boolean salirBarco(String nombre) {
		lista.remove(nombre);
		return true;
	}
	
	public double calcularPrecioViaje (Barco b, int horas, double precioCombustible) {
		if () {
			
		}
		
	}
	
	
}
