import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	private static int a,b;
	private static Calculator cal;
	
	@BeforeAll
	public static void setUpOnce() {
		a=10;
		b=5;
		cal=new Calculator();
	}
	@Test
	public void testsum() {
		int actual= cal.sum(a, b);
		int expect=15;
		assertEquals(expect,actual);
		
	}
	@Test
	public void testSubs() {
		int actual= cal.subs(a, b);
		int expect=5;
		assertEquals(expect,actual);
	}
	
	@Test
	public void testmuls() {
		int actual= cal.mul(a, b);
		int expect=50;
		assertEquals(expect,actual);
	}
	@Test
	public void testDiv() {
		int actual= cal.div(a, b);
		int expect=2;
		assertEquals(expect,actual);
	}
	
	
	@AfterAll
	public static void clear() {

		a=0;
		b=0;	
	}
	
	
}
