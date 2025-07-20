package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.java.dto.Pj9DTO;

@Mapper
public interface Pj9Mapper {

	@Select("""
			SELECT *
			FROM test
			WHERE (#{accept} = 0 AND accept = 0)
			   OR (#{accept} = 1 AND accept = 1)
			   OR (#{accept} NOT IN (0, 1))
			""")
	List<Pj9DTO> Pj9list(String accept);

	@Select("SELECT * FROM test WHERE no=#{no}")
	Pj9DTO pj9detail(int no);

	@Update("UPDATE test SET title=#{title},content=#{content} WHERE no=#{no}")
	int pj9edit(Pj9DTO pj9dto);
	
	@Insert("insert into test (title,content) values (#{title},#{content})")
	int pj9add(Pj9DTO pj9dto);

	@Update("UPdate test SET accept=#{accept} WHERE no=#{no}")
	int accept(Pj9DTO pj9dto);

}
