package com.simplilearn.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@Autowired
	private AdminService service;
	@RequestMapping("/admin")
	public String admin()
	{
		return "Welcome Admin";
	}
	
	@GetMapping("admin/getParticipants/")
	public List<Participant> getParticipants()  {
		List<Participant> list = service.getParticipants();
		return list;
	}
	
}