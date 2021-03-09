 package prob1;
import java.util.*;
public class store {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the ammount of employe");
		int en = s.nextInt();
		employe e = new employe();
		e.employeNum(en);
		for(int i = 1; i<=en; i++) {
		System.out.println("Enter the ammount for employe num "+i);
		int pay = s.nextInt();
		e.payment(pay);
		}
	  e.print();	
	}
}