package com.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mailController {
	
	@Autowired
	private mailRepository mailrepo;
	
	@PostMapping(path="/add")
	@ResponseBody
	public mail addmail(@RequestParam String email) {
		
		mail Mai = new mail();
		Mai.setMal(email);

		return mailrepo.save(Mai);
	}

	@RequestMapping("/")
	public String home(Model model) {

		return "index";

	}

}
