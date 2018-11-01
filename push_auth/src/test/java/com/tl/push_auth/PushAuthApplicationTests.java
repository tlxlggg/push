package com.tl.push_auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tl.push_auth.controller.TestController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PushAuthApplicationTests {
	
	@Autowired
	private TestController testController;

	@Test
	public void contextLoads() {
		System.out.println(testController.helloWorld());
	}

}
