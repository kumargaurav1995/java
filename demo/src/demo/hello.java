package demo;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		System.out.println("Type");
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
		/*int[] a = new int[n];
		for (int i=0;i<=a.length;i++){
		    a[i]=scan.nextInt();
		    
		} */int[] num = new int[n];
	    for (int i=0; i < num.length; i++){
	        int neki = scan.nextInt();
	        num[i]=neki;
	      }
		   scan.close();

	        // Prints each sequential element in array a
	        for (int i = 0; i < num.length; i++) {
	            System.out.println(num[i]);
	        }
	   
	}

}
