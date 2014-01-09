import java.util.Scanner;


public class Main {
	
	public static String ntimes(int n, String name) throws Exception{
		if (n<3)
			throw new Exception("n must be positive number");
		String result = "";
		for (int i=0; i < n;i++){
			result += name;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
	
		try {
			System.out.println(ntimes(3, "Ankit \n"));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
	
		}
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Number: ");
		try {
			int x = kb.nextInt();
			System.out.println("You typed in " + x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace("Please don't patar thok, enetr number");
			System.out.print(e);

		}
		
		System.out.print("End");
		
		
						
	}
		

}
