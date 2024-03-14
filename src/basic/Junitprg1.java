package basic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitprg1 {

	@Before
	public void urlopen()
	{
		System.out.println("urlload");
	}
	@Test
	public void test()
	{
		System.out.println("test1");
	}
	@After
	public void browserclose()
	{
		System.out.println("browserclose");
	}
	
}
