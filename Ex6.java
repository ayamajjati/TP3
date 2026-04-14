package TP3;

class Voiture{
	private String marque ;
	private int vitesse;
	public Voiture(String marque , int vitesse) {
		this.marque=marque;
		this.vitesse=vitesse;
	}
	public void accelerer(int vitesse) {
		if (vitesse + this.vitesse <= 240) {
			this.vitesse +=vitesse;
			System.out.println("Accélération de "+vitesse+" km/h...");
		}else {
			System.out.println("Vous avez depassé la vitesse maximale (240km/h) !!");
		}
	}
	public void freiner(int vitesse) {
		if(this.vitesse > vitesse ) {
			this.vitesse -= vitesse;
		}else {
			this.vitesse = 0;
			System.out.println("la voiture est arretée");
		}
	}
}

public class Ex6 {
	public static void main(String[] args) {
		Voiture V = new Voiture("mercedec", 90);
		V.accelerer(30);
		V.accelerer(200);
		V.freiner(20);
		V.freiner(100);
	}
}
