package File_PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		System.out.println("Enter the file name");
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		System.out.println("Enter the text to save");
		String txt=scan.nextLine();
	try{
		File file=new File(filename+".txt");
		if(!file.exists()){
			file.createNewFile();
		}
		PrintWriter pw=new PrintWriter(file);
		pw.println(txt);
		pw.close();
		System.out.println("your text is saved");
	}catch(IOException e){ 
		e.printStackTrace();
	}
	}
		// TODO Auto-generated method stub

	}


