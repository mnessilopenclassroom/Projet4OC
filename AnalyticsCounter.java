package Analytics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class AnalyticsCounter {
    /**
     * Main class to call classes and methods
     * all the program start from here
     *
     */

    static List<String> result = new ArrayList<String>();
    static Map<String, Integer> map = new HashMap<String, Integer>();
    static File symptom = new File("C:\\Users\\ROGUE1\\Documents\\apprendrecode\\formation salesforce OC\\projet 4\\projet hemebiotech\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application-master\\Project02Eclipse\\src\\analytics\\symptoms.txt");

    public static void main (String[]args) throws IOException {

        ReadSymptomDataFromFile readData = new ReadSymptomDataFromFile();
        readData.GetSymptoms(symptom, result);   // call method to read symptoms from file and put in a list
        CountOccur occur = new CountOccur();
        occur.getOccur(result, map);             // call method to count occurence in the list and put in a map
        SortAndWrite sort = new SortAndWrite();
        sort.getSortAndWrite(map);               // call method to sort the map and write what it contains in a file



    }

}
