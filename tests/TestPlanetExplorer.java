import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	
	PlanetExplorer explorer = new PlanetExplorer(3,3);

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_String(){
		
		
		int x = 2;
		int y = 3; 
		
		
		String expected = "(" + x + "," + y + ")";
		assertEquals(expected,explorer.toString(x,y));
	}
}
