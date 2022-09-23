package Keywords;


//this class cannot be inherted
public final class finalKeyword {
	public String name;
//	one way to use final keyword is to assign the value of variable here only so it cannot be changed but this is not prefered
//	private final int rollNum = 100;
	private final int rollNum;
	
	public finalKeyword(String n) {
//		this is the another way 
		this.rollNum = 1001;
		name = n;
	}
	public finalKeyword(String n, int rollNum) {
//		this keyword is used for specifing the variable
		this.rollNum = rollNum;
		name = n;
	}
	public void setRollNum(int n) {
		if(n <=0) {
			return;
		}
//		now as we have assigned rolNum as final the we cannot change it's value again
//		rollNum = n;
	}
//	now no function can have the same name
	public final void Display() {
		System.out.println(name+" "+rollNum);
	}
}
