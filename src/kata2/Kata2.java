package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int [] data = {5, 7, 9, 3, 1, 5, 6, 4, 2, 8, 3, 1, 3, 6, 9};
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);                
            }else{
                histogram.put(data[i], 1);                
            }
        }
        
        histogram.keySet().forEach((key) -> {
            System.out.println(key + "==>" + histogram.get(key));
        });
    }
}
