package com.taylor.amq.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taylor.amq.producer.SendMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/applicationContext-producer.xml" })
public class SendMessageTest {

	@Autowired
	@Qualifier("sendQueueMessageImpl")
	private SendMessage sendMessage;

	@Test
	public void testSendMessage() {
		sendMessage.sendMessage("test");

	}
}
