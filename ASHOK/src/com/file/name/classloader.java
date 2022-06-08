package com.file.name;

public class classloader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		classloader c=new classloader();
		System.out.println(c.getClass().getClassLoader());
		String s=new String();
		System.out.println(s.getClass().getClassLoader());
	}

}
