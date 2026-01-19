package Barcos;

public class Motor extends Barco {

	protected String Modelo;
	protected int Potencia;
	protected double Consumo;
	public Motor(String modelo, int potencia, double consumo) {
		super();
		Modelo = modelo;
		Potencia = potencia;
		Consumo = consumo;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getPotencia() {
		return Potencia;
	}
	public void setPotencia(int potencia) {
		Potencia = potencia;
	}
	public double getConsumo() {
		return Consumo;
	}
	public void setConsumo(double consumo) {
		Consumo = consumo;
	}
	@Override
	public String toString() {
		return "Motor [Modelo=" + Modelo + ", Potencia=" + Potencia + ", Consumo=" + Consumo + "]";
	}
	
	
	
}
