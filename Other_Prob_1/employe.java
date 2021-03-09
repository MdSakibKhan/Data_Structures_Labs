package prob1;

public class employe {
	public static int employeNum=0;
	public static int []sl;
	public static int j=0;
	public static int total=0;
	employe(){
	}
	void employeNum(int en) {
		sl= new int[en];
		employeNum = en; 
	}
	void payment(int p) {
		sl[j]=p;
		j++;
		}
	void print() {
		System.out.println("\n");
		for(int i = 0; i<sl.length; i++) {
		System.out.println("Payment for employe no "+(i+1)+" is "+ sl[i]);
		total=total+sl[i];
		}
		System.out.println("---------------------------------");
		System.out.println("Total payment            = "+ total);
	}
}
