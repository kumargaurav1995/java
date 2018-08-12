package JUnitTestCase;

import static org.junit.Assert.*;

import org.junit.Test;

public class concatTest {

	@Test
	public void concatTest() {
		MyClass myc= new MyClass();
		String result=myc.concat("hello","java");
		assertEquals("hellojava",result);
	}

}
