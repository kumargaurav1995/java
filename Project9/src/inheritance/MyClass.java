package inheritance;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;double a,b;
		System.out.println("Enter 0 to find area of triangle and 1 to find area of rectangle");
Scanner scan= new Scanner(System.in);
i=scan.nextInt();
System.out.println("Enter the height and width to find area");
a=scan.nextDouble();
b=scan.nextDouble();
scan.close();
rectangle rec=new rectangle();
triangle tri=new triangle();
rec.setValues(a, b);
tri.setValues(a, b);
switch(i){
case 0:System.out.println("Area of Triangle is"+tri.AreaOfTriangle());
break;
case 1:System.out.println("Area of Rectangle is"+rec.AreaOfRectangle());
break;
default:System.out.println("Please select between 0 and 1");
break;
}

	}

}
