package com.therealdanvega;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.qingjie.ControllersApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ControllersApplication.class)
@WebAppConfiguration
public class ControllersApplicationTests {

	@Test
	public void contextLoads() {
	}

}
