package TP3;

class CompteBancaire{
	private int numero ;
	private double solde ;
	public CompteBancaire(int numero , int solde ) {
		this.numero=numero ;
		this.solde=solde;
	}
	public void deposer(double montant) {
		 if (montant > 0) {
	            this.solde += montant;
	            System.out.println("Vous avez posé :"+montant);
	     }
	}
	public void retirer(double montant) {
		if (montant <= solde && this.solde >= montant) {
			this.solde -= montant ;
			System.out.println("Vous avez retiré :"+montant+" ,votre Solde est : " +solde);
		}else {
			System.out.println("retirage impossible");
		}
	}
	public void transferer(double montant, CompteBancaire X) {
		if(montant > 0) {
			this.retirer(montant);
			X.deposer(montant);
			System.out.println("Vous avez transferé "+montant+" vers le compte de numero :"+X.numero);
		}else {
			System.out.println("transfert impossible");
		}
	}
	public void afficherSolde() {
		System.out.println("\nVotre solde est : "+this.solde);
	}
}
public class Ex5 {
	public static void main(String[] args) {
		CompteBancaire C1= new CompteBancaire(1234 ,5000);
		CompteBancaire C2= new CompteBancaire(5678 ,9000);
		C1.afficherSolde();
        C2.afficherSolde();

        C1.transferer(1500, C2);

        C1.afficherSolde();
        C2.afficherSolde();
        
        C1.retirer(2000);
        C1.afficherSolde();
        
        C2.deposer(3000);
        C2.afficherSolde();
        
	}

}
