package loadridepolymorphism;

public class Amount extends MyClass {
	protected double p,t;
	double getInst(double p,double t){
		return((p*10*t/100)+1000);
	}
	int getInst(int p,int t){
		return 50000;
	}
}
