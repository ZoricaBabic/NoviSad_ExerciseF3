import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	
	PlanetExplorer explorer = new PlanetExplorer(3,3);

	
	@Test
	public void test_String(){
		
		
		int x = 2;
		int y = 3; 
		
		
		String expected = "(" + x + "," + y + ")";
		assertEquals(expected,explorer.toString(x,y));
	}
	
	@Test
	public void test_fN(){
		
		
		explorer.setSide("N");
		
		String expected = "(" + explorer.getVozilo().getX() + "," + (explorer.getVozilo().getY()+1)  + ")";
		
		assertEquals(expected,explorer.executeCommand("f"));
			
		
	}
	
	@Test
	public void test_b(){
		
		
		explorer.getVozilo().setX(0);
		explorer.getVozilo().setY(1);
		
		
		String expected = "(" + explorer.getVozilo().getX() + "," + (explorer.getVozilo().getY()-1)  + ")";
		
		assertEquals(expected,explorer.executeCommand("b"));
			
	}
}
