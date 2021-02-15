package Analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

// a class to read symptoms from a file
public class ReadSymptomDataFromFile implements ISymptomReader{
    /**
     * A method that will read symptom data from a file
     * The important part is, the result list , which is a list of strings,
     * that may contain many duplications
     *
     * @param  symptom File and a result List<String>
     */
	@Override
	public List<String> GetSymptoms(File symptom, List<String> result) {
		if (symptom != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(symptom)); // read file

				String line = reader.readLine();

				while (line != null) {
					result.add(line); // add Strings  to the list
					line = reader.readLine();
				}
				reader.close();
				System.out.println(symptom + " has been ridden correctly!! ");
			}
			// catch input output exceptions
			catch (IOException e) {
				System.out.println("Error: Unable to read the file!!!");
				e.printStackTrace();
			}
		}
		return result;
	}


}
