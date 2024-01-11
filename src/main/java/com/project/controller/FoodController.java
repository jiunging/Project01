package com.project.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.user.service.UserService;
import com.project.user.service.UserServiceImpl;

@WebServlet("*.food")
public class FoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FoodController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String path = (String)uri.substring(request.getContextPath().length());
		
		UserService service= new UserServiceImpl();
		
		if(path.equals("/order/basket.food")) {
			request.getRequestDispatcher("foodlist.jsp").forward(request, response);
		//mainfood.jsp -->>> mainfood.jsp로 복귀
		}else if(path.equals("/order/order1.food")){
			response.sendRedirect("../food/mainfood.jsp");
			
		// stick.jsp -->>> stick.jsp로 복귀
		}else if(path.equals("/order/order2.food")) {
			response.sendRedirect("../food/stick.jsp");
			
		// pancake.jsp -->>> pancake.jsp로 복귀
		}else if(path.equals("/order/order3.food")) {
			response.sendRedirect("../food/pancake.jsp");
			
		// rice.jsp -->>> rise.jsp 복귀
		}else if(path.equals("/order/order4.food")) {
			response.sendRedirect("../food/rice.jsp");
			
		// fired.jsp -->>> fried.jsp로 복귀
		}else if(path.equals("/order/order5.food")) {
			response.sendRedirect("../food/fried.jsp");
			
		// desert.jsp -->>> desert.jsp로 복귀
		}else if(path.equals("/order/order6.food")) {
			response.sendRedirect("../food/desert.jsp");
			
		// beverage.jsp -->>> beverage.jsp로 복귀
		}else if(path.equals("/order/order7.food")) {
			response.sendRedirect("../food/beverage.jsp");
			
		// drink.jsp -->>> drink.jsp로 복귀
		}else if(path.equals("/order/order8.food")) {
			response.sendRedirect("../food/drink.jsp");
		}

	}
}
