package com.hl.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hl.dao.UserDao;
import com.hl.model.User;
import com.hl.util.DbUtil;

/**
 * 实现登陆
 * 
 * */
public class userLoginServlet extends HttpServlet {
	UserDao userDao=new UserDao();
	DbUtil dbUtil=new DbUtil();
	
	private static final long serialVersionUID = 1L;
       
    public userLoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		Connection con =null;
		System.out.println("begin");
		User user=new User();
		String userPhone=request.getParameter("userPhone");
		String userPassword=request.getParameter("userPassword");
		user.setUserPassword(userPassword);
		user.setUserPhone(userPhone);
		User currUser=null;
		try {
			con=dbUtil.getCon();
			currUser=userDao.userLogin(con, user);
			if(currUser==null) {
				request.setAttribute("error", "手机号不存在或密码错误！");
				request.getRequestDispatcher("login.html").forward(request, response);
			}else {
				session.setAttribute("currentUser", currUser);
				request.getRequestDispatcher("login.html").forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
