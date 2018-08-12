package try_catch;
import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[2];
int b;
System.out.println("Enter numbers to add");
Scanner scan=new Scanner(System.in);
for(int index=0;index<2;index++){
a[index]=scan.nextInt();
}
try {
	b=((a[0]+a[1])/0);
	System.out.println("third array element "+a[3]);
}catch (ArithmeticException e){
	System.out.println(e);
	System.out.println("sum=not divisible by 0");
}
catch (Exception e){
	System.out.println(e);
	
}
finally{
	System.out.println("Exception test successful");
}
}}