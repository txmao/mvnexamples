package mvn.in;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void test() {
		Math t = new Math();
		assertEquals(3, t.pls(1, 2));
		assertEquals(1, t.min(2, 1));
	}
	@Test
	public void test2 () {
		Math t = new Math();
		assertEquals(4, t.pls(2, 2));
		assertEquals(0, t.min(2, 2));
	}

}
