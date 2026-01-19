package Barcos;

import java.util.ArrayList;

public class Puerto {
	protected ArrayList<Barco> lista;
	protected boolean entrarBarco;
	protected String salirBarco;
	protected double calcularPrecioViaje;
	
	public Puerto(ArrayList<Barco> lista, boolean entrarBarco, String salirBarco, double calcularPrecioViaje) {
		super();
		this.lista = lista;
		this.entrarBarco = entrarBarco;
		this.salirBarco = salirBarco;
		this.calcularPrecioViaje = calcularPrecioViaje;
	}

	public ArrayList<Barco> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Barco> lista) {
		this.lista = lista;
	}

	public boolean isEntrarBarco() {
		return entrarBarco;
	}

	public void setEntrarBarco(boolean entrarBarco) {
		this.entrarBarco = entrarBarco;
	}

	public String getSalirBarco() {
		return salirBarco;
	}

	public void setSalirBarco(String salirBarco) {
		this.salirBarco = salirBarco;
	}

	public double getCalcularPrecioViaje() {
		return calcularPrecioViaje;
	}

	public void setCalcularPrecioViaje(double calcularPrecioViaje) {
		this.calcularPrecioViaje = calcularPrecioViaje;
	}

	@Override
	public String toString() {
		return "Puerto [lista=" + lista + ", entrarBarco=" + entrarBarco + ", salirBarco=" + salirBarco
				+ ", calcularPrecioViaje=" + calcularPrecioViaje + "]";
	}
	
	
	
}
