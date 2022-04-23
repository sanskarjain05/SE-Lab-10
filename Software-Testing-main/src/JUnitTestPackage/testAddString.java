package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		String res=junit.addstring("Sanskar Jain,","E20CSE061");
		assertEquals("Sanskar Jain,E20CSE061",res);
	}

}
