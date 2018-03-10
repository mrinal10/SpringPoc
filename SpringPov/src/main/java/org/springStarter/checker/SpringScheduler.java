package org.springStarter.checker;

import org.springStarter.beans.model.LoginModel;
import org.springframework.scheduling.annotation.Scheduled;


public class SpringScheduler {
	
	private LoginModel loginModel;
	
	public LoginModel getLoginModel() {
		return loginModel;
	}

	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}
	@Scheduled(fixedDelay=1000)
	public void print(){
		System.out.println(System.currentTimeMillis());
	}
}
