package com.DAO;

import com.model.User;

public class TestUserDAO {
	public static void main(String args[]) throws Exception {
	
		User user = new User();
		user.setName("bbb");
		user.setPassword("pass");
		user.setEmail("bbhfghjjkb@gmail.com");
		user.setActive(0);
		user.setId(1);
		UserDAO userdao=new UserDAO();
		userdao.add(user);
	   System.out.println(user);
	 /*	boolean fla=userdao.login(user);
		System.out.println(fla);
		*/
		
		
		
	}

}
