package Barcos;


public class Barco {

	protected String Nombre;
	protected Motor motor;
	protected int capacidadCombustible;
	public Barco(String nombre, Motor motor, int capacidadCombustible) {
		super();
		Nombre = nombre;
		this.motor = motor;
		this.capacidadCombustible = capacidadCombustible;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}
	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}
	@Override
	public String toString() {
		return "Barco [Nombre=" + Nombre + ", motor=" + motor + ", capacidadCombustible=" + capacidadCombustible + "]";
	}
	
	
	
}
