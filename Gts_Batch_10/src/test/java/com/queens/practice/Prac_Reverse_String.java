package com.queens.practice;

public class Prac_Reverse_String {

	public static void main(String[] args) {
		String name = "Bangladesh", empty = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			empty = empty + name.charAt(i);
		}
		System.out.println(empty);

	}

}
