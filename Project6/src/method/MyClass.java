package method;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		System.out.println("Enter the number of Students in School");
	Scanner scan=new Scanner(System.in);
	int number;
	number=scan.nextInt();
	for(int x=1;x<=number;x++)
	{
		System.out.println("Enter the name,id and marks of physics,chemistry and maths of Student"+x);
	String name1=scan.next();
	double i=scan.nextDouble();
	double p=scan.nextDouble();
	double c=scan.nextDouble();
	double m=scan.nextDouble();
	double per=percentage(p,c,m);
	School stud=new School();
	stud.setId(i);
	stud.setName(name1);
	stud.setPercent(per);
	
	System.out.println("The student with details"+stud.getId()+stud.getName()+"has percentage"+stud.getPercent());
	}scan.close();
	}
	
	
	
	
	
	// TODO Auto-generated method stub
public static double percentage(double x,double y, double z){
	return (((x+y+z)/350)*100);
}
}
