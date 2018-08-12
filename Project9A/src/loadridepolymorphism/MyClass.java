package loadridepolymorphism;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;double p,t;
System.out.println("Please enter 1 for bank 1 and 2 for bank 2");
Scanner scan=new Scanner(System.in);
i=scan.nextInt();
Amount amt_1=new Bank_1();
Amount amt_2=new Bank_2();
System.out.println("Enter your amount and time");
p=scan.nextDouble();
t=scan.nextDouble();
scan.close();
switch (i) {
case 1:System.out.println("Your amount is"+(p+amt_1.getInst(p,t)));
	break;
case 2:System.out.println("Your amount is"+(p+amt_2.getInst(p,t)));
break;
default:System.out.println("You have not chosen any bank");
	break;
}
	}

}
