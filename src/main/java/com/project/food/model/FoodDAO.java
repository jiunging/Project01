package com.project.food.model;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class FoodDAO {
	
	private static FoodDAO instance = new FoodDAO();
	
	private DataSource dataSource;
	
	private FoodDAO() {
		
		try {
			InitialContext init = new InitialContext();
			dataSource = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("food 드라이버 호출과정에서 오류가 발생하였습니다.");
		}
	}
	
	public static FoodDAO getInstance() {
		return instance;
	}
	
	
	
	
}
