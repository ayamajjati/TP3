package TP3;
class Rectangle {
	
	private double largeur , hauteur ; 
	
	public Rectangle(double l , double h ) {
		this.largeur=l ; 
		this.hauteur=h ; 
	}
	public double surface () {
		return largeur * hauteur;
	}
	public double perimetre() {
		return 2 * (largeur + hauteur);
	}
	public void afficher() {
		System.out.println("la hauteur : "+hauteur);
		System.out.println("la largeur  : "+largeur);
		System.out.println("le perimetre  : "+ perimetre());
		System.out.println("la surface   : " + surface());
	}
	
}
public class Ex2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,4);
		r.afficher();
	}
}
