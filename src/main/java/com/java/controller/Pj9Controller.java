package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.service.Pj9Service;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class Pj9Controller {
	
	private final Pj9Service pj9Service;
	
	@GetMapping("/")//전체리스트
	public String Pj9list(Model model, HttpServletRequest req) {
		return pj9Service.Pj9list(model,req);
	}
	
	@GetMapping("/pj9detail")//수정화면
	public String Pj9detail(Model model, HttpServletRequest req) {
		return pj9Service.pj9detail(model,req);
	}
	@PostMapping("/pj9edit") //수정
	public String pj9edit(HttpServletRequest req) {
		return pj9Service.pj9edit(req);
	}
	
	@GetMapping("/pj9add")
	public String pj9add() {
		return "pj9add";
	}
	
	@PostMapping("/pj9add")
	public String pj9add(HttpServletRequest req) {
		return pj9Service.pj9add(req);
	}
	@GetMapping("/accept")
	public String accetp(HttpServletRequest req) {
		return pj9Service.accept(req);
	}
}
