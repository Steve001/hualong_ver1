package com.hl.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hl.dao.CusDao;
import com.hl.dao.UserDao;
import com.hl.model.Customer;
import com.hl.model.User;
import com.hl.util.DbUtil;

public class addCusServlet extends HttpServlet {

	CusDao cusDao=new CusDao();
	DbUtil dbUtil=new DbUtil();
	
	private static final long serialVersionUID = 1L;
       
    public addCusServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Connection con =null;
		HttpSession session = request.getSession();
		User user=(User) session.getAttribute("currentUser");
		Customer customer=new Customer();
		customer.setCusName(request.getParameter("cusName"));
		customer.setCusSex(request.getParameter("cusSex"));
		customer.setCusPhone(request.getParameter("cusPhone"));
		customer.setCus_area(Integer.parseInt(request.getParameter("cusArea")));
		customer.setCusDate(request.getParameter("cusDate"));
		int saveNum =0;
		
		
			try {
				con = dbUtil.getCon();
				saveNum= cusDao.addCus(con, customer, user);
				if(saveNum > 0) {
					request.getRequestDispatcher("").forward(request, response);
				} else {
					request.setAttribute("error", "����ʧ��");
					request.setAttribute("mainPage", "");
					request.getRequestDispatcher("").forward(request, response);
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
