package SDET;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Oa_ReadDataFromTextDoc {

	public static void main(String[] args) throws IOException {
		File file=new File("D:/Eclipse Oxygen/Eclipse Workspace/JavaInterviewPrograms/src/SDET/questions.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String st;
		while((st=br.readLine())!=null) {
			System.out.println(st);
			
		}

	}

}

