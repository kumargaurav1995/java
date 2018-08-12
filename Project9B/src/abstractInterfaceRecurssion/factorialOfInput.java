package abstractInterfaceRecurssion;

	public class factorialOfInput implements factorial{

	static int n;
	public static void setValues(int a){
		a=n;
	}
public static int fact(int n){
	if(n<=1)
		return 1;
	else 
		return (n*fact(n-1));
	
}
}
