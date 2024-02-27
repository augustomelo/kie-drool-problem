package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.validation.facade.RuleFacade;


@RestController
public class SimpleController {
	Logger logger = LoggerFactory.getLogger(SimpleController.class);
	RuleFacade vf;

	public SimpleController(RuleFacade vf) {
		this.vf = vf;
	}

	@GetMapping("/problem")
	private String problem() {
		logger.info("Before validate");
		vf.validate();
		logger.info("After validate");

		return "A wild problem appears";
	}
}
