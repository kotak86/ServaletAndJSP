
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("Ankit Kotak");
		Student s1 = new Student ("Kotak Ankit");
		Student s2 = new Student ("Sunil Kotak");
		s1.setCredits(100);
		Employee e = new Employee ("Ankitkumar Kotak");
		e.setSalary(10000.00);
		//p("name");
/*		System.out.println(p);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(e);
*/		
		Person[] people = {p, s1, s2, e};
	
		for(Person P : people){
			System.out.println(P);
		}
		
	}

}
