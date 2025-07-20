package com.java.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.dto.Pj9DTO;
import com.java.mapper.Pj9Mapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class Pj9DaoImp implements Pj9Dao{

	private final Pj9Mapper pj9Mapper;
	
	@Override
	public List<Pj9DTO> Pj9list(String accept) {
		return pj9Mapper.Pj9list(accept);
	}

	@Override
	public Pj9DTO pj9detail(int no) {
		return pj9Mapper.pj9detail(no);
	}

	@Override
	public int pj9edit(Pj9DTO pj9dto) {
		return pj9Mapper.pj9edit(pj9dto);
	}

	@Override
	public int pj9add(Pj9DTO pj9dto) {
		return pj9Mapper.pj9add(pj9dto);
	}

	@Override
	public int accept(Pj9DTO pj9dto) {
		return pj9Mapper.accept(pj9dto);
	}
	
}
