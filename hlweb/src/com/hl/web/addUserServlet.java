package com.hl.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.hl.dao.UserDao;
import com.hl.model.HttpModel;
import com.hl.model.User;
import com.hl.util.DbUtil;

public class addUserServlet extends HttpServlet {
	private static String tag = "regist";
	UserDao userDao = new UserDao();
	DbUtil dbUtil = new DbUtil();

	private static final long serialVersionUID = 1L;

	public addUserServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpModel httpModel = new HttpModel(tag);
		request.setCharacterEncoding("utf-8");
		Connection con = null;
		User user = new User();
		String userJigou = request.getParameter("jigou");
		String userName = request.getParameter("userName");
		String userPhone = request.getParameter("userPhone");
		String userPassword = request.getParameter("userPassword");
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		user.setUserPhone(userPhone);
		user.setUserJigou(userJigou);
		System.out.println(userJigou);
		if (userJigou == null || userName == null || userPhone == null || userPassword == null) {
			httpModel.setStatus(HttpModel.ERROR);
			response.getWriter().print(JSONObject.toJSON(httpModel));
		} else {
			try {
				con = dbUtil.getCon();
				int saveNum = userDao.addUser(con, user);
				System.out.println(saveNum);
				if (saveNum > 0) {
					httpModel.setStatus(HttpModel.SUCCESS);
				} else {
					httpModel.setStatus(HttpModel.ERROR);
				}
				response.getWriter().print(JSONObject.toJSON(httpModel));
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					dbUtil.closeCon(con);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
