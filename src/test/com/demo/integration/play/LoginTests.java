package com.demo.integration.play;

import com.demo.integration.play.config.SoapToRestIntegrationApplication;
import com.demo.integration.play.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jakarta.xml.soap.SOAPException;
import java.io.FileNotFoundException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { SoapToRestIntegrationApplication.class })
public class LoginTests {

	@Autowired
	private LoginService loginService;

	@Test
    public void contextLoads() throws FileNotFoundException, SOAPException {
        getLoginService().executeLogin();
//		getLoginService().pruebaToken();
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
}
