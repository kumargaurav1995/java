package classcons;

public class cube {
	double l,b,h;
public double getCubeVolume(){
	return (l*b*h);
}
cube(){
	System.out.println("Have you provide all the required values?");
}
cube(double a,double y){
	System.out.println("You have provided length,breadth"+a+y);
}
cube(double a,double y,double c){
	l=a;
	b=y;
	h=c;
}
}
