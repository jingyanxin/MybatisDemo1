package com.pojo;

import java.io.Serializable;

public class Books implements Serializable{
	private int bookid;
	private String bookname;
	private String bookauthor;
	private String bookpress;
	private float bookprice;
	private int classifiy;
	private int stock;
	private String synopsis;
	private String catalogue;
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(String bookname, String bookauthor, String bookpress, float bookprice, int classifiy, int stock,
			String synopsis) {
		super();
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookpress = bookpress;
		this.bookprice = bookprice;
		this.classifiy = classifiy;
		this.stock = stock;
		this.synopsis = synopsis;
	}
	public Books(int bookid, String bookname, String bookauthor, String bookpress, float bookprice, int classifiy,
			int stock, String synopsis, String catalogue) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookpress = bookpress;
		this.bookprice = bookprice;
		this.classifiy = classifiy;
		this.stock = stock;
		this.synopsis = synopsis;
		this.catalogue = catalogue;
	}
	public Books(int bookid, String bookname, String bookauthor, String bookpress, float bookprice, int classifiy,
			int stock, String synopsis) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookpress = bookpress;
		this.bookprice = bookprice;
		this.classifiy = classifiy;
		this.stock = stock;
		this.synopsis = synopsis;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public String getBookpress() {
		return bookpress;
	}
	public void setBookpress(String bookpress) {
		this.bookpress = bookpress;
	}
	public float getBookprice() {
		return bookprice;
	}
	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}
	public int getClassifiy() {
		return classifiy;
	}
	public void setClassifiy(int  classifiy) {
		this.classifiy = classifiy;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public String getCatalogue() {
		return catalogue;
	}
	public void setCatalogue(String catalogue) {
		this.catalogue = catalogue;
	}
	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookpress="
				+ bookpress + ", bookprice=" + bookprice + ", classifiy=" + classifiy + ", stock=" + stock
				+ ", synopsis=" + synopsis + ", catalogue=" + catalogue + "]";
	}
	
}
