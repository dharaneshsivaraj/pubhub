package com.model;

public class TestUser {
	public static void main(String args[])throws Exception
	{
		User user=new User();
		user.setId(1);
		user.setName("aaa");
		user.setPassword("pass");
		user.setActive(0);
		System.out.println(user);
		
	}
	

}
