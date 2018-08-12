package chapter3;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
	System.out.println("Enter two numbers");
	Scanner scan1 = new Scanner(System.in);
	double a,b,x;
	a=scan1.nextDouble();
	b=scan1.nextDouble();
	scan1.close();
		if(a>=b){
			x=(a-b);
			System.out.println(x++);
			System.out.println(x);
			// TODO Auto-generated method stub
		}
		else{
			x=(b-a);
			System.out.println("The modulus value is "+(x++));
			System.out.println(x);
		}
	}

}
