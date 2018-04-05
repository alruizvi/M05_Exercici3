package Exercici;


public class Vehicle{
	private int cilindrada;
	private int portes;
	private int velocitat_actual;
	public static final int velocitat_maxima = 120;
	public Vehicle(int cilindrada, int portes) {
		super();
		this.cilindrada = cilindrada;
		this.portes = portes;
		this.velocitat_actual = 0;
	}
}