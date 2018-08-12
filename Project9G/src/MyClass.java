import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
	System.out.println("enter the path of file to read");
	Scanner scan=new Scanner(System.in);
	String filepath=scan.nextLine();
	BufferedReader br=null;
	scan.close();
	String line;
	try{
		FileReader fr=new FileReader(filepath);
		br=new BufferedReader(fr);
	while((line=br.readLine())!=null){
		System.out.println(line);
	}
	}catch(IOException e){
		e.getStackTrace();
	}finally{
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
		// TODO Auto-generated method stub

	}

}
