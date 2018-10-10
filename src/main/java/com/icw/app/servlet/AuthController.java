package com.icw.app.servlet;

import java.security.Principal;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
	@GetMapping("/")
	public String rootForm(Model model) {
		return "login";
		}
		@GetMapping("/login")
		public String loginForm(Model model) {
		return "login";
		}
		@GetMapping("/home")
		public String loginSuccessForm(Principal principal, Model model) {
		Authentication authentication = (Authentication)principal;
		String username = authentication.getName();
		model.addAttribute("username", username);
		return "home";
		}
		@GetMapping("/invalidSession")
		public String invalidSessionForm(Model model) {
		return "login";
		}
}