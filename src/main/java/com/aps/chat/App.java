package com.aps.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.aps.chat.config.ObjMsg;

@Controller
public class App {

	@MessageMapping("/chatMessage")
	@SendTo("/canal")
	public ObjMsg sendMessage(ObjMsg message) {
		return message;
	}

}
