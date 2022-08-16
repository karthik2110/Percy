package com.Cortex.Cases;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = System.getProperty("user.dir");
		
		String text1 = text+"CortexID\\Drivers\\chromedriver.exe";
		
		String msg = text1.replace("\\", "\\\\");
		
		System.out.println(msg);

	}

}
