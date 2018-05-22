package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyJunitAppApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void add() {
		int a = 5;
		int b = 6;
		
		assertEquals(11, a+b);
		assertNotEquals(13,a+b);
		
	}

}
