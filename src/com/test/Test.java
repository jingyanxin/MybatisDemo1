package com.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.IBooksMapper;
import com.pojo.Books;

public class Test {
	private  static Reader reader;
	private  static SqlSessionFactory sessionFactory;
	private static SqlSession session;
	private static IBooksMapper bookmapper;

	//公共部分
	public  static IBooksMapper bookmapper(){
		try {
			reader = Resources.getResourceAsReader("config.xml") ;
			sessionFactory=new SqlSessionFactoryBuilder().build(reader);
			session=sessionFactory.openSession();
			bookmapper=session.getMapper(IBooksMapper.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookmapper;
	}



	//增加
	public static void save(){
		bookmapper=Test.bookmapper();
		Books book =new Books("7%","77","77",77.4f,3,77,"777");
		int rows=bookmapper.save(book);
		if(rows>0){
			session.commit();
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
		if(session!=null)session.close();
	}

	//查询单个
	public static void findById(){
		bookmapper=Test.bookmapper();
		Books book=bookmapper.findById(9);
		System.out.println("查询结果:"+book.toString());
	}

	//删除
	public static void delById(){
		bookmapper=Test.bookmapper();
		int rows=bookmapper.delById(10);
		if(rows>0){
			session.commit();
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
	}

	//修改
	public static void update(){
		bookmapper=Test.bookmapper();
		Books book =new Books(11, "55","55","55",55.5f,5,555,"555");
		int rows=bookmapper.update(book);
		if(rows>0){
			session.commit();
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
		if(session!=null)session.close();

	}

	//查询全部
	public static void findAll(){
		bookmapper=Test.bookmapper();
		List<Books> bklist=bookmapper.findAll();
		//System.out.println("bklist:"+bklist.size());
		for(Books book : bklist)
			System.out.println("查询结果:"+book.toString());
	}

	//findByName
	public static void findByName(){
		bookmapper=Test.bookmapper();
		List<Books> listbook=bookmapper.findByName("/%");
		for (Books book : listbook) {
			System.out.println("查询结果:"+book.toString());
		}
	}

	//findByNameif
	public static void findByNameif(){
		bookmapper=Test.bookmapper();
		List<Books> listbook=bookmapper.findByName("");
		for (Books book : listbook) {
			System.out.println("查询结果:"+book.toString());
		}
	}
	//findIfAndWhere
	public static void findIfAndWhere(){
		bookmapper=Test.bookmapper();
		Books book = new Books();
		book.setBookname("44");
		book.setBookpress("44");
		book.setClassifiy(4);
		List<Books> listbook=bookmapper.findIfAndWhere(book);
		for (Books books : listbook) {
			System.out.println("查询结果:"+books.toString());
		}
	}

	//findIfAndWhereTrim
	public static void findIfAndWhereTrim(){
		bookmapper=Test.bookmapper();
		Books book = new Books();
		book.setBookname("44");
		book.setBookpress("44");
		//	book.setClassifiy(5);
		List<Books> listbook=bookmapper.findIfAndWhere(book);
		for (Books books : listbook) {
			System.out.println("查询结果:"+books.toString());
		}
	}
	public static void main(String[] args) {
		//save();
		//findById();
		//delById();
		//update();
		findAll();
		//findByName();
		//	findByNameif();
		//findIfAndWhere();
		//findIfAndWhereTrim();
	}
}
