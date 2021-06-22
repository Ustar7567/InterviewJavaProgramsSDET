package SDET;

import java.io.FileWriter;
import java.io.IOException;

public class Ob_WriteDataToTextFile {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("D:/Eclipse Oxygen/Eclipse Workspace/JavaInterviewPrograms/src/SDET/questions.txt");
			fw.write("All programs are written");
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
	}
		System.out.println("Success");

}
}
