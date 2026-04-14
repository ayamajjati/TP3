package TP3;
import java.util.*;
public class Ex7Bonus {
	public static void main  (String [] args ) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int n = rand.nextInt(10)+1;
		int saisi = 0 ;
		int essais =0;
        System.out.println("Devinez le nombre entre 1 et 10 :");
        while (saisi != n) {
            System.out.print("Votre essai : ");
            saisi = sc.nextInt();
            essais++;

            if (saisi < n)
                System.out.println("Plus grand ");
            else if (saisi > n)
                System.out.println("Plus petit ");
            else {
            	System.out.println("Bravo !");
            	int score = 10 - essais; 
                if (score < 0) score = 0;
                System.out.println("Tentatives : " + essais);
                System.out.println("Votre score : " + score + " / 10");
            }
        }
        sc.close();
	}
}
