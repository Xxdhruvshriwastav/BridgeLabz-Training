package iostreampractice.iostreampractice.csv.basicproblem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {
	public static void main(String[] args) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("userData.csv"))) {
			bw.append("ID, Name, Department, Salary");
			bw.newLine();
			bw.append("111,Ashish,DataScience,10000");
			bw.newLine();
			bw.append("83,Shriyansh,DataScience,10000");
			bw.newLine();
			bw.append("98,RAvi,DataScience,10000");
			bw.newLine();
			bw.append("141,Ritesh,DataScience,10000");
			bw.newLine();
			bw.append("140,Raj,DataScience,10000");
			bw.newLine();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
