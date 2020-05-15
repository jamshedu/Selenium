package com.syntax.utils;

public class Exceptions {
	
	public static void sleep(int number) {
		try {
			Thread.sleep(number);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
