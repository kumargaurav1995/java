package arrays;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int length;
System.out.print("How many friends are going?");
length=scan.nextInt();
int[] array1=new int[length];
String[] array2=new String[length];
for(int index=0;index<length;index++)
{System.out.print("Enter the name of friend"+(index+1));
array2[index]=scan.next();
System.out.println("Enter the roll of friend"+(index+1));
array1[index]=scan.nextInt();
}
scan.close();
System.out.print("The name and roll of friends are");
for(int index=0;index<length;index++)
{
	System.out.print(array2[index]);
	System.out.print(array1[index]);
	System.out.print("   ");
	}
	}
}
