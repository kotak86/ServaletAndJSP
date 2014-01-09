
public class Employee extends Person {

	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private double salary;
	
	public double getSalary() {
		return salary;
	}
	


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return getName() + " Salary:" + salary;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
