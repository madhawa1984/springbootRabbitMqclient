package com.springapp.mvc;

import com.springapp.models.textMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@Autowired
	private RabbitTemplate amqpTemplate;
	@RequestMapping(value="/pushmessage",method = RequestMethod.POST,headers ="Accept=application/json")
	public @ResponseBody textMessage printWelcome(ModelMap model,@RequestBody textMessage msg) {
		model.addAttribute("message", msg);
		System.out.println("xxx");
		amqpTemplate.convertAndSend(msg);
		return msg;
		// return "hello";
	}
}