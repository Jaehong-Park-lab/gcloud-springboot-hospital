package com.ggoreb.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ggoreb.hospital.model.Hospital;
import com.ggoreb.hospital.repository.HospitalRepository;

@Controller
public class HomeController {
  @Autowired
  HospitalRepository hospitalRepository;
  
	@GetMapping("/home")
	public String home(Model model) {
	  List<Hospital> list = hospitalRepository.findAll();
		model.addAttribute("list", list);
	  return "home";
	}
}
