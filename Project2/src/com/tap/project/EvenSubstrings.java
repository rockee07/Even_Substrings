package com.tap.project;

import java.util.Scanner;

public class EvenSubstrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		evenSubstrings(s);
	}
	public static void evenSubstrings(String s) {
		for(int k=2;k<=s.length();k++) {
			for(int i=0;i<=s.length()-k;i++) {
				String t="";
				for(int j=i;j<i+k;j++) {
					char ch=s.charAt(j);
					t=t+ch;
				}
				if(t.length()%2==0) {
					for(int j=i;j<i+k;j++) {
						System.out.print(s.charAt(j));
					}
					System.out.println();
				}
			}
		}
	}
}
