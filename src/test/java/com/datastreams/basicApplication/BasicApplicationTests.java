package com.datastreams.basicApplication;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BasicApplicationTests {


	public static Logger logger = LoggerFactory.getLogger(BasicApplicationTests.class);
	@Test
	public void contextLoads() {
		logger.info("test Case Executed Successfully");
	}

}
