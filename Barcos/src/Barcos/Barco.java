package Barcos;


public class Barco {

	protected String Nombre;
	protected int capacidadCombustible;
	public Barco(String nombre, int capacidadCombustible) {
		super();
		Nombre = nombre;
		this.capacidadCombustible = capacidadCombustible;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}
	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}
	@Override
	public String toString() {
		return "Barco [Nombre=" + Nombre + ", capacidadCombustible=" + capacidadCombustible + "]";
	}
	
	
	
	
	
	
}
