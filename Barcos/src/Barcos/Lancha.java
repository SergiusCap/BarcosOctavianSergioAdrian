package Barcos;


public class Lancha extends Barco {
protected boolean cubierta;

public Lancha(String nombre, Motor motor, int capacidadCombustible, boolean cubierta) {
	super(nombre, motor, capacidadCombustible);
	this.cubierta = cubierta;
}

@Override
public double calcularAutonomia() {
	
	return super.calcularAutonomia();
}

public boolean isCubierta() {
	return cubierta;
}

public void setCubierta(boolean cubierta) {
	this.cubierta = cubierta;
}

@Override
public String toString() {
	return "Lancha [cubierta=" + cubierta + ", toString()=" + super.toString() + "]";
}


	
	
}
