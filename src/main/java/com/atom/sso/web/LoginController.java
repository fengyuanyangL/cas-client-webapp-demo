package com.atom.sso.web;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.util.AssertionHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {

	Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		
		logger.info("sso-client login");
		
		// AttributePrincipal principal = (AttributePrincipal)request.getUserPrincipal();
		AttributePrincipal principal = AssertionHolder.getAssertion()
				.getPrincipal();

		if (null != principal) {
			String loginName = principal.getName();

			logger.info("loginName:{}", loginName);

			Map<String, Object> attributes = principal.getAttributes();
			if (attributes != null) {
				attributes.get("username"); 
				logger.info("loginName:{}", loginName);
			}
		}

		return "login";
	}

	@RequestMapping("/submit")
	public String submit(String username, String password) {

		if (null != username) {
			return "welcome";
		}
		return "error";
	}

}
