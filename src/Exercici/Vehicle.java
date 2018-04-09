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
	
	public static void accelerar() {
		if (velocitat_actual < velocitat_maxima) {
			velocitat_actual += 10;
		}else {
			System.out.println("Ya se ha alcanzado la velocidad maxima");
		}
	}
	
	public static void desaccelerar() {
		if(velocitat_actual>0) {
			velocitat_actual-=10;
		}else {
			System.out.println("El vehiculo ya esta parado.");
		}
	}
}