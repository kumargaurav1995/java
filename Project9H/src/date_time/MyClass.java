package date_time;
import java.util.Date;
import java.text.*;
public class MyClass {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("Date is "+date.toString());
		System.out.println("Time is "+date.getTime());
		System.out.println("Month  is "+date.getMonth()+1);
		System.out.println("Year is "+date.getYear());
		System.out.println("Day is "+date.getDay());
		System.out.println("Date is "+date.getDate());
		SimpleDateFormat sdf=new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
		System.out.println("Formatted Style is "+sdf.format(date));
		// TODO Auto-generated method stub

	}

}
