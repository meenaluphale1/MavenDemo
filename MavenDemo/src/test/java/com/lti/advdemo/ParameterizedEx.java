package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class ParameterizedEx {
/*
	@ParameterizedTest
	@ValueSource(ints = { 8, 4, 2, 6, 12 })
	public void test_int_arrays(int arg) {
		System.out.println("arg => " + arg);
		Assertions.assertTrue(arg % 2 == 0);
	}*/

	@Test
	public void checkForarray()
	{
		Integer intArray[]= {2,3,7,10};
		List<Integer> numbers= Arrays.asList(intArray);		
		Assertions.assertAll(
				()->assertEquals(2,numbers.get(0)),
				()->assertEquals(3,numbers.get(1)),
				()->assertEquals(7,numbers.get(2))				
				);		
	}

}
