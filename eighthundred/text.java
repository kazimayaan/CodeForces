package eighthundred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class text {
    public static void main(String[] args) {
      int[] v = { 1, 2, 3, 1, 1, 4 };
        System.out.println(Arrays.toString(freq(v)));
    }

    private static int[] freq(int[] v) {
        int n = v.length;
      
        Map<Integer, Integer> maps = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(maps.containsKey(v[i])){
                int val = maps.get(v[i]);
                int newval = ++val;
                maps.put(v[i],val);
            }
            else{
                maps.put(v[i], 1);
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : maps.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "," + value);
        }
        List<Integer> keys = new ArrayList<>(maps.keySet());
        Collections.sort(keys);
        int[] res = new int[2];

        int minf =Integer.MAX_VALUE;
        int maxf = Integer.MIN_VALUE;
        for (int key : keys){
            if(maxf<maps.get(key)){
                maxf = maps.get(key);
                res[0] = key;
            }
           
        }
     for(int key : keys){
         if(minf>maps.get(key)){
             minf = maps.get(key);
             res[1] = key;
         }
     }

        return res;
    }
}
