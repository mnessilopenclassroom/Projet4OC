package analytics;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter2 {

    static List<String> result = new ArrayList<String>();
    static Map<String, Integer> map = new HashMap<String, Integer>();
    static File symptom = new File("C:\\Users\\ROGUE1\\Documents\\apprendrecode\\formation salesforce OC\\projet 4\\projet hemebiotech\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application-master\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt");

    public static void main (String[]args) {

        readSymptomDataFromFile readData = new readSymptomDataFromFile();
        readData.getSymptoms(symptom, result);
        countOccur occur = new countOccur();
        occur.getOccur(result, map);
        sortAndWrite sort = new sortAndWrite();
        sort.getSortAndWrite(map);


    }

}
