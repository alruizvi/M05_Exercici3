package Exercici;


public class Vehicle{
	public int cilindrada;
	public int portes;
	public static int velocitat_actual;
	public static final int velocitat_maxima = 120;
	public Vehicle(int cilindrada, int portes) {
		super();
		this.cilindrada = cilindrada;
		this.portes = portes;
		Vehicle.velocitat_actual = 0;
	}
}