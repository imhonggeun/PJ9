package com.java.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.java.dao.Pj9Dao;
import com.java.dto.Pj9DTO;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Pj9ServiceImp implements Pj9Service{
	
	private final Pj9Dao pj9Dao;

	@Override
	public String Pj9list(Model model, HttpServletRequest req) {
		String accept = req.getParameter("accept");
		if (accept == "" || accept== null) accept="2";
		List<Pj9DTO> pj9DTO = pj9Dao.Pj9list(accept);
		model.addAttribute("reuslt", pj9DTO);
		return "pj9list";
	}

	@Override
	public String pj9detail(Model model, HttpServletRequest req) {
		int no = Integer.parseInt(req.getParameter("no"));
		Pj9DTO pj9DTO = pj9Dao.pj9detail(no);
		model.addAttribute("result", pj9DTO);
		return "pj9detail";
	}

	@Override
	public String pj9edit(HttpServletRequest req) {
		int no = Integer.parseInt(req.getParameter("no"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		Pj9DTO pj9DTO = Pj9DTO.builder().no(no).title(title).content(content).build();
		pj9Dao.pj9edit(pj9DTO);
		return "redirect:/";
	}

	@Override
	public String pj9add(HttpServletRequest req) {
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		Pj9DTO pj9DTO = Pj9DTO.builder().title(title).content(content).build();
		pj9Dao.pj9add(pj9DTO);
		return "redirect:/";
	}

	@Override
	public String accept(HttpServletRequest req) {
		int no = Integer.parseInt(req.getParameter("no"));
		boolean accept = (req.getParameter("accept").equals("0")) ? true : false;
		Pj9DTO pj9DTO = Pj9DTO.builder().no(no).accept(accept).build();
		pj9Dao.accept(pj9DTO);
		return "redirect:/";
	}

}
