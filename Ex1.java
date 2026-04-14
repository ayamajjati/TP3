package TP3;
class Point {
	private double x , y ; 
	
	public Point () {
		this.x=1;
		this.y=1;
	}
	public Point (double x , double y){
		this.x=x;
		this.y=y;
	}
	public void afficher() {
		System.out.println("le point ("+x+","+y+")");
	}
	public void deplacer(double dx , double dy) {
		x = x + dx;
		y = y + dy;
	}
	public double calculeDistanceOrigine() {
		return  Math.sqrt(x*x+y*y);
	}
	public double DistancePoint (Point p) {
		return Math.sqrt(Math.pow(p.x - x, 2)+Math.pow(p.y - y, 2)); 
	}
	public double getX() {
	    return x;
	}
	public double getY() {
	    return y;
	}
}
public class Ex1 {
	public static void main (String[] args) {
		Point p1 = new Point(3,4);
		p1.afficher();
		System.out.println("Distance à l'origine : " + p1.calculeDistanceOrigine());
		p1.deplacer(2, 1);
        System.out.print("Après déplacement de (2,1) -> ");
        p1.afficher();
        Point p2 = new Point(2,2);
        System.out.println("Distance au point :("+ p2.getX() +","+ p2.getY()+") est :"
        +p1.DistancePoint(p2));
        
	}

}
