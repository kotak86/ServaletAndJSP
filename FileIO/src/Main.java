import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String fileName = "write.txt";
		try {
			PrintWriter file1 = new PrintWriter(fileName);
			file1.println("Hi Ankit how are you");
			for (int row = 0; row < 10 ;row++){
				for (int col = 0; col <10; col++){
					file1.print("*");
					
				}
				
			file1.println("");
				
			}
			
			file1.close();
			System.out.println("Done");
			
		} catch (FileNotFoundException e) {
			// TO	DO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
