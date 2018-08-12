package abstractInterfaceRecurssion;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to find factorial");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
scan.close();
factorialOfInput facto = new  factorialOfInput();
facto.setValues(n);
System.out.println("factorial="+  facto.fact(n));
	}

}
