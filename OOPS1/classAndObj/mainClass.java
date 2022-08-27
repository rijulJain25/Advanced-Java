package classAndObj;

class Student {
	
	public String name;
	private int rollNum;
	
	public Student(String n) {
		name = n;
	}
	public Student(String n, int rollNum) {
		name = n;
		this.rollNum = rollNum;
	}
	public void setRollNum(int n) {
		if(n <=0) {
			return;
		}
		rollNum = n;
	}
	public void Display() {
		System.out.println(name+" "+rollNum);
	}
}

public class mainClass{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Rijul", 1001);
		s1.Display();
		
		Student s2 = new Student("Rijul");
		s2.setRollNum(1002);
		s2.Display();
	}
}