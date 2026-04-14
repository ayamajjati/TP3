package TP3;
class NombreComplexe{
	private double reel , imaginaire ;
	
	public NombreComplexe(double reel , double imaginaire) {
		this.imaginaire=imaginaire;
		this.reel=reel;
	}
	public NombreComplexe addition(NombreComplexe z) {
		double r = this.reel+z.reel ;
		double i = this.imaginaire+z.imaginaire ; 
		return new NombreComplexe(r, i);
	}
	public NombreComplexe multiplication(NombreComplexe z) {
		//double r = (this.reel * z.reel) - (this.imaginaire * z.imaginaire);
        //double i = (this.reel * z.imaginaire) + (this.imaginaire * z.reel);
		return new NombreComplexe((this.reel * z.reel) - (this.imaginaire * z.imaginaire), (this.reel * z.imaginaire) + (this.imaginaire * z.reel));
	}
	public void afficher() {
		System.out.println("  "+reel+"+"+imaginaire+" i ");
	}
}

public class Ex4 {
	public static void main(String[] args) {
		NombreComplexe z1 = new NombreComplexe( 1 ,2 );
		z1.afficher();
		NombreComplexe z2= new NombreComplexe( 2 ,3 );
		NombreComplexe som = z1.addition(z2);
		System.out.println("la somme est : ");
		som.afficher();
		NombreComplexe mul = z1.multiplication(z2);
		System.out.println("la multiplication est : ");
		mul.afficher();
	}
}
