package com.zjx.mq.bootactivemq;

import com.zjx.mq.bootactivemq.service.Queue_Produce;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BootActivemqApplicationTests {

	@Resource
	Queue_Produce queue_produce;

	@Test
	void contextLoads() {
		queue_produce.produceMsg();
	}

}
