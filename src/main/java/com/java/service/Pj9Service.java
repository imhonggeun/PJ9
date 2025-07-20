package com.java.service;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;

public interface Pj9Service {

	public String Pj9list(Model model, HttpServletRequest req); //전체 화면

	public String pj9detail(Model model, HttpServletRequest req); // 디테일 화면

	public String pj9edit(HttpServletRequest req);//수정

	public String pj9add(HttpServletRequest req); //추가

	public String accept(HttpServletRequest req); // 승인,미승인

}
