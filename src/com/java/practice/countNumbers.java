package com.java.practice;
import java.util.Scanner;

public class countNumbers {

	public static void main(String[] args) {
		int a,result=0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
		countNumbers cn = new countNumbers();
		result= cn.countDigits(a,result);
		System.out.println(result);
	}
	public int countDigits(int a, int result) {
		if(a==0) {
			return result;
		}
		else {
			result = countDigits(a/10, result);
			result = result+1;
			return result;
		}
	}
}
