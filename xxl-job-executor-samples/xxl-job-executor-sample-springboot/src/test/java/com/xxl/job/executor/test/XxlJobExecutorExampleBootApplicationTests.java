package com.xxl.job.executor.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Date;

@SpringBootTest
public class XxlJobExecutorExampleBootApplicationTests {

	@Test
	public void test() {
		Timestamp timestamp = new Timestamp(new Date().getTime());
		System.out.println(timestamp);
		System.out.println(11);
		System.out.println(new Date());
	}

}