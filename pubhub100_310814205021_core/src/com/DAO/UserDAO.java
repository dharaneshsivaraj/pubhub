package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.model.User;
import com.util.ConnectionUtil;

public class UserDAO {
	public void add	(User user) throws Exception {
		Connection connection=ConnectionUtil.getConnection();
		String sql=("insert into user(name,email,password) values (?,?,?);");
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, user.getName());
		preparedStatement.setString(2, user.getEmail());
		preparedStatement.setString(3, user.getPassword());
		preparedStatement.executeUpdate();
	}
	 public boolean login(User user) throws Exception {
		 Connection connection=ConnectionUtil.getConnection();
		 String sql=("select name from user where email = ? and password = ?;");
		 PreparedStatement pst=connection.prepareStatement(sql);
		 
		 pst.setString(1,user.getEmail());
		 pst.setString(2, user.getPassword());
		 ResultSet rs=pst.executeQuery();
		 boolean flag=false;
		 if(rs.next())
		 {
			 flag=true;
			 
		 }return flag;
		
	}

}
