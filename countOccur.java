package analytics;


import java.util.List;
import java.util.Map;


// a class to count  symptoms from a list
public class countOccur {

    /**
     * A method that will count occurrence in a list
     * The important part is, the map Map , which is a map filled (key and value) with the strings in the list
     * without duplication
     *
     * @param  result list List<String>  and a map Map<String, Integer>
     */


    static void getOccur(List<String> result, Map<String, Integer> map) {

     for (String sympt : result) { // for each loop to read the list
         map.merge(sympt, 1, Integer::sum); // give sympt to the key if  == null add 1 to value else sum the values
     }
        System.out.println("Occurrence count completed successfully");
    }



}
