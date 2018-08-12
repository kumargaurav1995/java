package classcons;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		double l,b,h;
		System.out.println("Enter length,breadth and height to find cube");
		Scanner scan1 = new Scanner(System.in);
		l=scan1.nextDouble();
		b=scan1.nextDouble();
		h=scan1.nextDouble();// TODO Auto-generated method stub
scan1.close();
cube cube1=new cube();
cube cube2=new cube(l,b);
cube cube3=new cube(l,b,h);
System.out.println("Your cube volume is"+cube3.getCubeVolume());

	}

}
