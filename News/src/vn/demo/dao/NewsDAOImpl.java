package vn.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vn.demo.utils.*;
import vn.demo.bo.News;
import vn.demo.idao.INewDAO;

public class NewsDAOImpl implements INewDAO {
	Scanner scanner = new Scanner(System.in);

	public void addNews(Statement stt) {
		System.out.println("Nhap gia tri");
		System.out.println("nhap id");
		int catagory_id = scanner.nextInt();

		System.out.println("nhap name");
		scanner.nextLine();
		String name1 = scanner.nextLine();
		System.out.println("nhap des");
		String description = scanner.nextLine();
		System.out.println("nhap detail");
		String detail = scanner.nextLine();
		System.out.println("nhap image");
		String image = scanner.nextLine();
		System.out.println("nhap date");
		String date1 = scanner.nextLine();
		System.out.println("nhap userid");
		int user_id = scanner.nextInt();
		String sql5 = "insert into news(category_id,name,description,detail,image,date,user_id) values (" + catagory_id
				+ ", '" + name1 + "','" + description + "'," + "'" + detail + "'," + "'" + image + "'," + "'" + date1
				+ "'," + user_id + ")";
		try {
			stt.execute(sql5);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteNewsByName(String s, Statement stt) {
		// TODO Auto-generated method stub
		String sql1 = "delete from news where name = '" + s + "';";
		System.out.println(sql1);
		try {
			stt.execute(sql1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void findNewByName(String s, Statement stt) {
		// TODO Auto-generated method stub
		List<News> list = new ArrayList<News>();
		String sql = "select *from news where name = '" + s + "';";
		ResultSet rs = null;
		try {
			rs = stt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				News news = new News();
				int id = rs.getInt("id");
				news.setId(id);
				int cate = rs.getInt("category_id");
				news.setCategory_id(cate);
				String name = rs.getString("name");
				news.setName(name);
				String des = rs.getString("description");
				news.setDescription(des);
				String detal = rs.getString("detail");
				news.setDetail(detal);
				String image = rs.getString("image");
				news.setImage(image);

				Date date = (Date) rs.getDate("date");
				news.setDate(date.toString());
				int user_id = rs.getInt("user_id");
				news.setUser_id(user_id);
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("id   " + "          name        " + "                    date       ");
		for(News news : list) {
			System.out.println(news.getId() + "              "  + news.getName() + "                       " +       news.getDate());
		}
	}

	@Override
	public void getNews(Statement stt) {
		// TODO Auto-generated method stub

		List<News> list = new ArrayList<News>();
		String sql = "select *from news ;";
		ResultSet rs = null;
		try {
			rs = stt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				News news = new News();
				int id = rs.getInt("id");
				news.setId(id);
				int cate = rs.getInt("category_id");
				news.setCategory_id(cate);
				String name = rs.getString("name");
				news.setName(name);
				String des = rs.getString("description");
				news.setDescription(des);
				String detal = rs.getString("detail");
				news.setDetail(detal);
				String image = rs.getString("image");
				news.setImage(image);

				Date date = (Date) rs.getDate("date");
				news.setDate(date.toString());
				int user_id = rs.getInt("user_id");
				news.setUser_id(user_id);
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("id   " + "          name        " + "                    date       ");
		for(News news : list) {
			System.out.println(news.getId() + "              "  + news.getName() + "                       " +       news.getDate());
		}
	
	}

	@Override
	public void updateNewsByName(String s, Statement stt) {
		// TODO Auto-generated method stub
		System.out.println("Input Date update");
		String date = scanner.nextLine();
		String sql3 = "update news set date ='"+ date + "'" + " where name ='"   + s+ "'";
		try {
			stt.execute(sql3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
