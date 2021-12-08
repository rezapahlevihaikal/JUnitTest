package com.juaracoding.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.juaracoding.main.function.Function;

public class TestingFunction {
	Function function;
	
	@Before
	public void setUp() throws Exception {
		function = new Function();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAverageSpeed() {
//		fail("Not yet implemented"); // TODO
		assertEquals(40.0, function.averageSpeed(200.0, 5.0),0.0);
		
	}

}
