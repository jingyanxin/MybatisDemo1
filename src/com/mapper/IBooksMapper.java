package com.mapper;

import java.util.List;

import com.pojo.Books;

public interface IBooksMapper {

	public int save(Books book);
	
	public int update(Books book);
	
	public int delById(Integer bookid);
	
	public Books findById(Integer bookid);
	
	public List<Books> findAll();
	
	public List<Books> findByName(String bookname);
	
	public List<Books> findByNameif(String bookname);

	public List<Books> findIfAndWhere(Books book);
	
	public List<Books> findIfAndWhereTrim(Books book);
}
