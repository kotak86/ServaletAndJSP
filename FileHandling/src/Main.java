import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

		
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "goog.csv";
		File file1 = new File(fileName);
		try {
			Scanner readFile = new Scanner(file1);
			readFile.next(); // ignoring first line
			double sum = 0;
			double numberOfPrices = 0; 
			while (readFile.hasNext()){
				String data = readFile.next();
				String[] value = data.split(",");
				System.out.println(value[4]);
				double cprice = Double.parseDouble(value[3]);
				System.out.println(cprice);
				sum += cprice;
				numberOfPrices++;
			}
			
			System.out.println("Average Price is: "+ (sum/numberOfPrices));
			
		readFile.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
