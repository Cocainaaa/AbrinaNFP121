import java.awt.Color;

public class Cercle implements Mesurable2D{
	private Point centre;
	private double rayon;
	private Color couleur;
	private Point circonference;
	
	public static final double PI = Math.PI;
	
	/**
	 * 
	 * @param centre
	 * @param rayon
	 * @param diametre
	 */
	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
		this.couleur = Color.blue;
	}
	
	/**
	 * 
	 * @param centre
	 * @param circonference
	 */
	
	public Cercle(Point centre, Point circonference) {
		this.centre = centre;
		this.circonference = circonference;
		this.couleur = Color.blue;
		
	}
	/**
	 * 
	 * @param p1
	 * @param p2
	 * @return un cercle de centre p1 et de circonférence p2
	 */
	
	public static Cercle creeCercle(Point p1,Point p2) {
		return new Cercle(p1,p2);	
	}
	
	/**
	 * 
	 * @return le centre du cercle 
	 */


	public Point getCentre() {
		return centre;
	}
	
	/**
	 * 
	 * @param centre
	 */


	public void setCentre(Point centre) {
		this.centre = centre;
	}
	
	/**
	 * 
	 * @return le rayon du cercle
	 */


	public double getRayon() {
		return rayon;
	}
	
	/**
	 * 
	 * @param rayon
	 */
	

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	/**
	 * 
	 * @return le diametre du cercle
	 */
	
	
	public double getDiametre() {
		return this.rayon*2 ;
	}
	
	/**
	 * 
	 * @param diametre
	 */
	
	public void setDiametre(double diametre) {
		this.rayon = diametre/2;
	}
	
	/**
	 * 
	 * @return la couleur du cercle
	 */

	
	public Color getCouleur() {
		return this.couleur;
	}
	
	/**
	 * 
	 * @param couleur
	 */


	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	
	public void translater(double x, double y) {
		this.centre.translater(x, y);
	}
	/**
	 * 
	 * @param point
	 * @return Si le point point est à l'intérieur du cercle
	 */
	
	public boolean contient(Point point) {
		return Math.pow(point.getX() - this.centre.getX(),2.0) + Math.pow(point.getY()- this.centre.getY(), 2.0) <= this.rayon;
	}
	/**
	 * Affichage du cerlce
	 */
	

	
	public String toString() {
		return "C" + this.rayon + "@("+ this.centre.getX() + ", " + this.centre.getY() + ")";
	}
	
	/**
	 * Calcul le perimètre du cerlce
	 */

	@Override
	public double perimetre() {
		return 2 * PI * this.rayon;
	}
	
	/**
	 * Calcul l'aire du cercle
	 */


	@Override
	public double aire() {
		return PI * Math.pow(this.rayon,2.0);

	}
	

	
	
	
	
}