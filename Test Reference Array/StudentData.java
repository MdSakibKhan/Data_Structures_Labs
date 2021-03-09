
public class StudentData {
	String name;
	double cgpa;
	public void setName(String name) {
		this.name=name;
	}
	public void setCgpa(double cgpa) {
		this.cgpa=cgpa;
	}
	public void details() {
		System.out.println(name+"-     ->"+cgpa);
	}
}
