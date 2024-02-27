package com.example.demo.validation.facade;

import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Component;

import com.example.demo.validation.executor.RuleExecutor;

@Component
public class RuleFacade {
	RuleExecutor re;

	public RuleFacade(RuleExecutor re) {
		this.re = re;
	}

	public void validate() {
		KieSession ks = re.initializeRules();
		re.executeRule(ks);
	}
}
