package com.java.practice;
import java.util.*;


public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		sc.close();
		HelloWorld hw = new HelloWorld();
		hw.testFunction(a);
	}
	public void testFunction(int a) {
		System.out.println(a);
	}

}
