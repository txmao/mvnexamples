package tt1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class t1 {
	private t ts;
	private t2 ts2;
	@Before
	public void stup() {
		ts=new t();
		ts2=new t2();
	}
	@Test
	public void tp() {
		assertEquals(2, ts.pls(1, 1));
	}
	@Test
	public void tm() {
		assertEquals(0, ts.min(1, 1));
	}
	@Test
	public void tqdh() {
		assertTrue(ts.qdh(3, 2));
		assertEquals(2, ts2.mtpl(1, 2));
	}

}
