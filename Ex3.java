package TP3;
class Etudiant {
	private String cne ; 
	private double note ;
	
	public Etudiant(String cne , double note) {
		this.cne=cne;
		this.note=note;
	}
	public String toString() {
		String S = "CNE :"+cne + " et la note :"+note ;
		return S ;
	}
	public boolean estAdmis() {
		return note >= 10 ;
	}
}
public class Ex3 {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("D123456", 18.0);
        System.out.println(e1.toString());
        
        if(e1.estAdmis()) {
            System.out.println("Statut : Admis");
        } else {
            System.out.println("Statut : Ajourné");
        }
    }
}
