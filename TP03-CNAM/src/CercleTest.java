import org.junit.*;
import static org.junit.Assert.*;
import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class CercleTest {
	
	public static final double EPSILON = 1e-6;
	
	private Cercle cercle1;
	
	@Before
	public void setUp() {

		 Point p1;
		cercle1 = new Cercle(p1 = new Point(1,2),5,10);
	}
	
	@Test
	public void testInitialisation() {
		assertTrue(cercle1 != null);
		assertTrue(cercle1.getCentre().getX() == 1);
		assertTrue(cercle1.getCentre().getY() == 2);
		assertTrue(cercle1.getRayon()== 5);
		assertTrue(cercle1.getDiametre()== 10);

	}
	
	@Test
	public void testInitialisationMieux() {
		assertNotNull(cercle1);
		assertEquals(1.0, cercle1.getCentre().getX() , EPSILON);
		assertEquals(2.0, cercle1.getCentre().getY() , EPSILON);
		assertEquals(5.0, cercle1.getRayon() , EPSILON);
		assertEquals(10.0, cercle1.getDiametre() , EPSILON);
		assertEquals(Color.blue, cercle1.getCouleur());
	}
	

	@Test
	public void testSetP() {
		cercle1.setCentre(new Point(5,3));
		assertEquals(5, cercle1.getCentre().getX(), EPSILON);
		assertEquals(3, cercle1.getCentre().getY(), EPSILON);
	}
	@Test
	public void testSetRayon() {
		cercle1.setRayon(15);
		assertEquals(15, cercle1.getRayon(), EPSILON);
	}
	@Test
	public void testSetDiametre() {
		cercle1.setDiametre(30);
		assertEquals(30, cercle1.getDiametre(), EPSILON);
	}	
	@Test
	public void testSetCouleur() {
		cercle1.setCouleur(Color.black);
		assertEquals(Color.black, cercle1.getCouleur());
	}
	
	@Test
	public void translater() {
		cercle1.translater(10,10);
		assertEquals(11, cercle1.getCentre().getX(), EPSILON);
		assertEquals(12, cercle1.getCentre().getY(), EPSILON);
	}
	
	@Test
	public void estInferieur() {
		Point pointtest = new Point(1,4);
		assertFalse(cercle1.contient(pointtest));
	}
	
	@Test
	public void afficher() {
		assertEquals("C5.0@(1.0,2.0)", cercle1.toString());
	}
	
	@Test
	public void aire() {
		assertEquals(Math.PI*25, cercle1.aire(),EPSILON);
	}
	
	@Test
	public void perimetre() {
		assertEquals(Math.PI*10, cercle1.perimetre(),EPSILON);
	}
	
	

}
