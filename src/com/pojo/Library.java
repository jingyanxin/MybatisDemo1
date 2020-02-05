package com.pojo;

import java.io.Serializable;

public class Library implements Serializable{
	private int lid;
	private String catalogue;
	private Books book;
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(int lid, String catalogue, Books book) {
		super();
		this.lid = lid;
		this.catalogue = catalogue;
		this.book = book;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getCatalogue() {
		return catalogue;
	}
	public void setCatalogue(String catalogue) {
		this.catalogue = catalogue;
	}
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Library [lid=" + lid + ", catalogue=" + catalogue + ", book=" + book + "]";
	}
	
	
}

