package com.local.ysf.BooksServices.books_exposition;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController("/contact")
public class PersonalInfos {
	
	@Value("${contact.fullname}")
	private String fullname;
	@Value("${contact.email}")
	private String email;
	@Value("${contact.github}")
	private String github;

	
	
	@GetMapping("infos")
	public String Infos() {
		return "PersonalInfos from Books Services [fullname=" + fullname + ", email=" + email + ", github=" + github + "]";
	}



	
	
}
