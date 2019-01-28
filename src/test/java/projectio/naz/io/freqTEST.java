package projectio.naz.io;

import org.junit.Test;

import junit.framework.TestCase;

public class freqTEST extends TestCase {

	
	@Test
	public void testFreqMax() {
		App app=new App();
		int maxim=app.max_freq();
		int expect=3;
		assertEquals(expect,maxim);
	}
	@Test
	public void testFreqMin() {
		App app=new App();
		int minim=app.min_freq();
		int expect=1;
		assertEquals(expect,minim);
	}
}
