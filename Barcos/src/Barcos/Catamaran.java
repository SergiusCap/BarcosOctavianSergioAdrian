package Barcos;
import Barcos.Motor;
public class Catamaran extends Barco {

	protected Motor motorSecundario;

	public Catamaran(String nombre, Motor motor, int capacidadCombustible, Motor motorSecundario) {
		super(nombre, motor, capacidadCombustible);
		this.motorSecundario = motorSecundario;
	}

	public Motor getMotorSecundario() {
		return motorSecundario;
	}

	public void setMotorSecundario(Motor motorSecundario) {
		this.motorSecundario = motorSecundario;
	}

	@Override
	public String toString() {
		return "Catamaran [motorSecundario=" + motorSecundario + "]";
	}

	@Override
	public double calcularAutonomia() {
		// TODO Auto-generated method stub
		return (capacidadCombustible/motor.Consumo+capacidadCombustible/motorSecundario.Consumo)/2;
	}

	
	
	
	
}
