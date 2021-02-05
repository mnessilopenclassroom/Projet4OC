package analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class countOccur {



    static void getOccur(List<String> result, Map<String, Integer> map) {

     for (String sympt : result) {
         Integer count = map.get(sympt);
         if ( count == null) {
             map.put(sympt, 1);
         } else {
             map.put(sympt, count + 1);
         }
     }
        System.out.println("Occurrence count completed successfully");
    }




}
