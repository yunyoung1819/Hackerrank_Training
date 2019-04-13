package com.hackerrank.challenges;

import java.util.Scanner;
import java.security.*;

/**
 * @problem : Java Int to String
 * @author : yunyoung
 * @Date : 2019.04.13
 * @link : https://www.hackerrank.com/challenges/java-int-to-string/problem
 * 
 * @Task : You are given an integer n, you hava to convert it into a string.
 * Please complete the partially completed code in the editor. 
 * If your code successfully converts n into a string s the code will
 * print "Good job". Otherwise it will print "Wrong answer".
 * n can range between -100 to 100 inclusive.
 * 
 * @Sample Input 0
 * 100
 * 
 * @Sample Output 0
 * Good job
 */
public class IntToString {

	public static void main(String[] args) {		
		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			
			String s = Integer.toString(n);
			
			if (n == Integer.parseInt(s) ) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}