package com.nt.main;

import com.nt.add.Addition;


public class MainApp {

	public static void main(String[] args) {
		
		Addition addition=new Addition();
		int result=addition.add(29,47);
		System.out.println("Addition of 29 and 47 is "+result);
	}

}
