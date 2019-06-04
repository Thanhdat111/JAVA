package vn.demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import vn.demo.bo.*;
import vn.demo.dao.NewsDAOImpl;
import vn.demo.utils.*;
public class MainProgram {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ConnectionUtils con = new ConnectionUtils();
		Connection conn = con.getMyConnection();
		Statement statement = conn.createStatement();
		NewsDAOImpl manager = new NewsDAOImpl();
		int inputNumber=-1;
//		//manager.addNews(statement);
//		System.out.println("Nhap ten");
//		String s = scanner.nextLine();
//		//manager.deleteNewsByName( s, statement);
//		manager.findNewByName(s, statement);
//		manager.updateNewsByName(s, statement);
//		manager.getNews(statement);
label1:	do {
			System.out.println("-------------------------");
			System.out.println("Choose one number below");
			System.out.println("1.Add News");
			System.out.println("2.Show list News");
			System.out.println("3.Exit!");
			System.out.println("4.Seach");
			System.out.println("5.Update Date");
			System.out.println("------------------------");
			System.out.println("Input Number :");
			inputNumber = scanner.nextInt();
			
			switch(inputNumber) {
			case 1:
				manager.addNews(statement);;
				break;
			case 2:
					manager.getNews(statement);;
				break;
			case 3:
				System.out.println("do you want exit!");
				System.out.println("1.Yes");
				System.out.println("2.No");
				int i = scanner.nextInt();
				if(i==1) {
					break;	
				}
				if(i==2) {
					continue label1;
				}
				break;
			case 4:
				scanner.nextLine();
				System.out.println("Input name ");
				String name = scanner.nextLine();
				System.out.println("---------------");
				System.out.println("List was found ");
				System.out.println("---------------");
				manager.findNewByName(name, statement);;
				break;
			case 5:
				scanner.nextLine();
				System.out.println("Input name");
				String na = scanner.nextLine();
				manager.updateNewsByName(na, statement);
				break;
			default:
				System.out.println("you inputNumber wrong,please input again !!");
				break;
			}
		}
		while(inputNumber!=3);
	}

}
