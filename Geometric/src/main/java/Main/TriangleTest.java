package Main;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	private static Triangle triangle;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		triangle = new Triangle(1,1,1);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetArea()
	{
		assertTrue(triangle.getArea()==(Math.sqrt(3)/4));
		assertFalse(triangle.getArea()==5);
	}
	@Test
	public void testGetPerimeter()
	{
		assertTrue(triangle.getPerimeter()==3);
		assertFalse(triangle.getPerimeter()==56);
	}

}
