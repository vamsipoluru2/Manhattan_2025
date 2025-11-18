import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertationEx {

	@Test 
	@DisplayName("MyMethod to Test String")//this used to give custome names instd of method names
	public void test() {
		String s1="Hello";
		String s2="Hello";
		assertEquals(s1, s2);//checks the content
		System.out.println("Test method..");
	}
	@Test
	@DisplayName("check boolean Value")
	public void testBoolean() {
		boolean b=true;
//		assertFalse(b);//expect false but true
		assertTrue(b);//expected true a;lso true
		
	}
	
	@Test
	@DisplayName("checks conatent is same or not")
	public void testObject() {//comapare reference 
		String s1="Hello";
		String s2="Hello";
		assertSame(s1, s2);
		}

	@Test
	@DisplayName("checks content of the array")
	public void testArray() {
		Integer expected[]= {10,20,30};
		Integer actual[]= {10,20,30};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	@DisplayName("true is s is null")
	public void testNullValue() {
		String s=null;
		assertNull(s);
	}
	
	@Test
	@DisplayName("true is s is Notnull")
	public void testNullNotValue() {
		String s="hello";
		assertNotNull(s);
	}
	
	
	
}
