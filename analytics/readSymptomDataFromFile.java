package analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class readSymptomDataFromFile {


	public static void  getSymptoms (File symptom, List<String> result) {

		
		if (symptom != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(symptom));

				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				System.out.println("Error: Unable to read the file!!!");
				e.printStackTrace();
			}
		}
		
		System.out.println(symptom + " has been read correctly!! ");
	}

}
