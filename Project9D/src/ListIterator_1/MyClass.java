package ListIterator_1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the names to add");
ArrayList<String> name=new ArrayList<String>();
/*name.add("mark");
name.add("tom");
name.add("john");
name.add("nick");*/


Scanner scan= new Scanner(System.in);
for(int i=0;i<=2;i++){
	String nm=scan.nextLine();
    name.add(nm);
}
scan.close();
ListIterator<String> itr=name.listIterator();
while(itr.hasNext())
	System.out.println(itr.next());

System.out.println(" ");
System.out.println(" ");

while(itr.hasPrevious())
	System.out.println(itr.previous());
	}

}
