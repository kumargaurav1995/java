package string;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		print();
	}public static void print(){
		System.out.println("Enter any name and any character in name to find index");
		Scanner scan=new Scanner(System.in);
		String x=scan.next();
		String y=scan.next();
		System.out.println(x.length());
		System.out.println(x.toUpperCase());
		System.out.println(x.indexOf(y));// TODO Auto-generated method stub
scan.close();
	}
}
