package analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class sortAndWrite {

	static void getSortAndWrite(Map<String, Integer> map) {

		Map<String, Integer> sortMap = new TreeMap<String, Integer>(map);
		File resultOut = new File("result.out");

		BufferedWriter writeResult = null;
		try {
			writeResult = new BufferedWriter(new FileWriter(resultOut));
		} catch (IOException e) {
			System.out.println("Error: Unable to write the file!!!");
			e.printStackTrace();
		}
		for (Map.Entry<String, Integer> saisie : sortMap.entrySet()) {
			 String clé = saisie.getKey();
			 Integer valeur = saisie.getValue();

			try {
				writeResult.write(clé + " : " + valeur + "\n");
			} catch (IOException e) {
				System.out.println("Error: Unable to write the result!!!");
				e.printStackTrace();
			}
			System.out.println("Your file result.out has been created");
		}
	}
}
		
