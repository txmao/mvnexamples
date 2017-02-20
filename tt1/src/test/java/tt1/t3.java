package tt1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class t3 {
	private t2 ts;
	@Before
	public void stup() {
		ts = new t2();
	}
	@Test
	public void t3ts() {
		int x=3;
		int y=5;
		int z=x*y;
		assertEquals(z, ts.mtpl(x, y));
	}

}
