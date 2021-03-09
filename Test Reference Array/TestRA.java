import java.util.*;
public class TestRA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ammount of students");
		int am = scan.nextInt();
		StudentData []student = new StudentData[am];
		for(int i = 0; i<student.length; i++) {
			System.out.println("Enter NAME of student no "+(i+1));
			student[i]=new StudentData();
			scan.nextLine();
			student[i].setName(scan.nextLine());
			System.out.println("Enter CGPA of student no "+(i+1));
			student[i].setCgpa(scan.nextDouble());
		}
		for(int i = 0; i<student.length; i++) { 
			student[i].details();
		}	
	}
}
