package TP3;

class Produit{
	private int id;
	private String nom , description;
	private double prix ;
	private int quantite;
	
	 private static Produit[] Produits = new Produit[100];
	 private static int nbProduits = 0;
	
	public Produit(int id , String nom , String description , double prix , int quantite) {
		this.id=id;
		this.nom=nom;
		this.description=description;
		this.prix=prix;
		this.quantite=quantite;
	}
	public void ajouterProd() {
		Produits[nbProduits]=this;
		nbProduits++;
		System.out.println(" le produit "+this.nom+"a été ajouté au système ");
	}
	public static  void modifierProd(int id,String nv_nom ,double nv_prix) {
		for(int i=0; i < nbProduits ; i++) {
			if(Produits[i].id == id) {
				Produits[i].nom= nv_nom;
				Produits[i].prix= nv_prix;
			}
		}
		
	}
	public static  void supprimerProd(int id) {
		for (int i = 0; i < nbProduits; i++) {
            if (Produits[i].id == id) {
                for (int j = i; j < nbProduits - 1; j++) {
                    Produits[j] = Produits[j + 1];
                }
                Produits[nbProduits - 1] = null;
                nbProduits--;
                System.out.println("Produit supprimé .");
            }
        }
	}
	public static  void getProduitByID(int id) {
		for (int i = 0; i < nbProduits; i++) {
            if (Produits[i].id == id) {
                System.out.println("Trouvé : ID: " + Produits[i].id + " | Nom: " + Produits[i].nom + " | Prix: " +Produits[i].prix + " DH");
                return;
            }
        }
        System.out.println("Produit introuvable.");
	}
	public static void getALLProduit() {
		if (nbProduits == 0) {
            System.out.println("Aucun produit dans la liste.");
            return;
        }
        System.out.println("Liste des produits ");
        for (int i = 0; i < nbProduits; i++) {
            System.out.println("ID: " + Produits[i].id + " | Nom: " + Produits[i].nom + " | Prix: " + Produits[i].prix + Produits[i].prix+ " | Quantité: " + Produits[i].quantite);
        }
	}
}
public class Ex7 {
	public static void main(String[] args) {
		Produit p1 = new Produit(1, "Écran LED", "24 pouces HD", 1200.0, 5);
        Produit p2 = new Produit(2, "Clavier", "Mécanique RGB", 350.0, 10);
        Produit p3 = new Produit(3, "Souris", "Sans fil", 150.0, 8);
        p1.ajouterProd();
        p2.ajouterProd();
        p3.ajouterProd();
        
        Produit.getALLProduit();
        Produit.modifierProd(2, "Clavier Sans Fil", 400.0);
        Produit.supprimerProd(1);
	}
}
