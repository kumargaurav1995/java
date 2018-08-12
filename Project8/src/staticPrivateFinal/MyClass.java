package staticPrivateFinal;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String name;double pert;
		System.out.println("Enter your name and percent");
Scanner scan= new Scanner(System.in);
name=scan.nextLine();
pert=scan.nextDouble();
scan.close();
Stu stu1=new Stu();
	if (pert>=80)
		System.out.println( name+" You have passed "+stu1.displayStd()+"-"+Stu.CongratsMsg());
	else
		System.out.println( name+" You have passed "+stu1.displayStd()+"-"+Stu.SorryMsg());
	}


	}


