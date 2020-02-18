package com.gzm.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gzm.project.service.BandService;


@Controller
public class BandController {
	
	@Autowired
	private BandService bandService;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("bands",bandService.밴드목록보기());
		return "/band/list";
	}
}
