package com.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dao.PatientDao;
import com.entity.Patient;
import com.helper.MailSender;
import com.helper.PatientFile;





@Controller
public class HomeController {

	@Autowired
	PatientDao pdao;
	
	@Autowired
	MailSender mailsend;
	
	
	@GetMapping("/")
	public String home() {
		
		return"home";
	}
	
	
	@PostMapping("/submit_contact")
	public String submitContact(@ModelAttribute("contact") Patient patient, @RequestParam("pFile") MultipartFile file) {
		
		System.out.println(patient);
		//pdao.save(patient);
		PatientFile.saveFile(file);
		mailsend.sendMail(patient.getPemail());
		
		
		return"success";
	}
	
}
