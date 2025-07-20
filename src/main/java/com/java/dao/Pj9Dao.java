package com.java.dao;

import java.util.List;

import com.java.dto.Pj9DTO;

public interface Pj9Dao {

	public List<Pj9DTO> Pj9list(String accept);

	public Pj9DTO pj9detail(int no);

	public int pj9edit(Pj9DTO pj9dto);

	public int pj9add(Pj9DTO pj9dto);

	public int accept(Pj9DTO pj9dto); 

}
