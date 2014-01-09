
public class Student extends Person {

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private int credits;
	
	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public String toString(){
		
		return getName() + " Credit:" + credits;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
