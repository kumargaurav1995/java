package arrayList;

import java.util.Scanner;

import java.util.ArrayList;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 0,1 and 2 to add,getting size,clear list respectively");
Scanner scan= new Scanner(System.in);
int roll;String name;int opt;
opt=scan.nextInt();
ArrayList<Integer> rollList=new ArrayList<Integer>(50);
ArrayList<String> nameList=new ArrayList<String>(50);
if(opt==0|| opt==1 || opt==2){
	if (opt==0){
	System.out.println("Enter the number of students");
	int length=scan.nextInt();
	for(int index=0;index<length;index++)
	{System.out.print("Enter the roll of friend"+(index+1));
	roll=scan.nextInt();
	System.out.println("Enter the name of friend"+(index+1));
	name=scan.next();
	rollList.add(roll);
	nameList.add(name);	
}
}
	if(opt==1){
		System.out.println("no enteries");
	}
	else{
		System.out.println("invalid");
	}
}
	for(Integer x :rollList)  
		System.out.println(x);
	for(String y :nameList)
	System.out.println(y);
	System.out.println("Enter 0,1 and 2 to add,getting size,clear list respectively");
	opt=scan.nextInt();
	if(opt==1){
	System.out.println("size-"+nameList.size());
	for(Integer x :rollList)  
		System.out.println(x);
	for(String y :nameList)
	System.out.println(y);
}
	System.out.println("Enter 0,1 and 2 to add,getting size,clear list respectively");
	opt=scan.nextInt();
	if(opt==2){
	rollList.clear();
	nameList.clear();
	for(Integer x :rollList)  
		System.out.println(x);
	for(String y :nameList)
	System.out.println(y);
		}scan.close();

}
	
}
	



/*int[] array1=new int[length];
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
	}*/