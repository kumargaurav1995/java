package staticPrivateFinal;

public class Stu extends MyClass{
private static double pert;
public String name;
private static double getpert() {
	return pert;
}
private static void setpert(double pert) {
	Stu.pert = pert;
}
private String getName() {
	return name;
}
private void setName(String name) {
	this.name = name;
}
private String getStan() {
	return stan;
}
protected final String stan="XII";
public static String CongratsMsg(){
	return("Congrats!You are eligible");
}
public static String SorryMsg(){
	return("Sorry! You are not eligible");
}

protected String displayStd(){
	return ("Your standard is"+stan);
}
}
