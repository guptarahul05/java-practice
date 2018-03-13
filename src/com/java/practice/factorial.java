package com.java.practice;
import java.util.*;

public class factorial {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		factorial fc=  new factorial();
		int result = fc.fact(a);
		System.out.println(result);
	}
	public int fact(int a) {
		if(a==0) {
			return 1;
		}
		else {
			return a*fact(a-1);
		}
	}

}
