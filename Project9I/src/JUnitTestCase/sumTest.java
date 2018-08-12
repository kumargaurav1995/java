package JUnitTestCase;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumTest {

	@Test
	public void sumTest() {
	MyClass myc=new MyClass();
	int result=myc.sum(2,3);
	assertEquals(5,result);
	}

}
