package com.project.food.serivce;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.food.model.FoodDAO;
import com.project.food.model.FoodVO;

public class FoodServiceImpl implements FoodService{

	private FoodDAO dao = FoodDAO.getInstance();
	
	// type 별 Database 값 가져오기
	@Override
	public ArrayList<FoodVO> getList(HttpServletRequest request, HttpServletResponse response) {
		
		String category = request.getParameter("type");
		request.setAttribute("category", category);
		
		ArrayList<FoodVO> list = dao.getList(category);
		return list;
	}

	
	@Override
	public void inSert(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String category = request.getParameter("type");
		
	}


}
