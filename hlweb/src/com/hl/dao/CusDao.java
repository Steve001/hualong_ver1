package com.hl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hl.model.Customer;
import com.hl.model.User;
import com.hl.util.DateUtil;

public class CusDao {

	DateUtil dateUtil=new DateUtil();
	public int addCus(Connection connection,Customer customer,User user) throws SQLException {
		String sql="insert into customer values(null,?,?,?,?,?,?,?)";
		PreparedStatement pstmt=connection.prepareStatement(sql);
		pstmt.setString(1, customer.getCusName());
		pstmt.setString(2, customer.getCusSex());
		pstmt.setString(3, customer.getCusPhone());
		pstmt.setInt(4, customer.getCus_area());
		pstmt.setString(5, dateUtil.getSystemTime());
		pstmt.setInt(6, user.getUserId());
		pstmt.setInt(7, 1);
		return pstmt.executeUpdate();
	}

}
