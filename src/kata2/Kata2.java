package kata2;

import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int [] data = {5, 7, 9, 3, 1, 5, 6, 4, 2, 8, 3, 1, 3, 6, 9};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        histogr.keySet().forEach((key) -> {
            System.out.println(key + "==>" + histogr.get(key));
        });
    }
}