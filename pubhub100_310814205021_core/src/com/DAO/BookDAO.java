package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Book;
import com.util.ConnectionUtil;

public class BookDAO 
{
	public void add(Book book) throws Exception {
		Connection connection=ConnectionUtil.getConnection();
		String sql="insert into book  (name,price) values (?,?)";
		PreparedStatement pst=connection.prepareStatement(sql);
		pst.setString(1,book.getName());
		pst.setInt(2,book.getPrice());
		pst.executeUpdate();

	}

}
