package Analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

// A class that contains a method to change the map to sort it and write what it contains in a file result.out

public class SortAndWrite {
	/**
	 * A method that will change a Map in a Treemap it will be sort by key (alphabetical)
	 * The important part is, the file "result.out" it's gonna be filled with the data in the map
	 * without duplication and sorted by key
	 *
	 * @param  map Map<String, Integer>
	 */

	static void getSortAndWrite(Map<String, Integer> map) throws IOException { // @throws  Input Output exceptions

		Map<String, Integer> sortMap = new TreeMap<>(map);
		File resultOut = new File("result.out"); 	//	create the file

		BufferedWriter writeResult = null;
		try {
			writeResult = new BufferedWriter(new FileWriter(resultOut));
		} catch (IOException e) {											// throws Input Output exceptions
			System.out.println("Error: Unable to write the file!!!");
			e.printStackTrace();
		} System.out.println("Your file result.out has been created " + resultOut.getAbsolutePath());
		for (Map.Entry<String, Integer> saisie : sortMap.entrySet()) { 	// for each loop to read treeMap
			String clef = saisie.getKey();    							// get keys and values from the map
			Integer valeur = saisie.getValue();

			try {
				writeResult.write(clef + " : " + valeur + "\n");     // write keys and values in the file result.out
			} catch (IOException e) { 										// throws Input Output exceptions
				System.out.println("Error: Unable to write the result!!!");
				e.printStackTrace();
			}

		} System.out.println("Your file result.out has been Filled ");
		writeResult.flush();
		writeResult.close();
	}

}


		
