package vn.demo.idao;
import java.sql.Statement;
import java.util.List;

import vn.demo.bo.*;
public interface INewDAO {
	public void addNews(Statement stt);
	public void deleteNewsByName(String s, Statement stt);
	public void findNewByName(String s, Statement stt);
	public void getNews(Statement stt);
	void  updateNewsByName (String s ,Statement stt);
	
}
