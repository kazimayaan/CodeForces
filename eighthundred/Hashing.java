package eighthundred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] v = { 1, 2, 3, 1, 1, 4 };
        System.out.println(Arrays.toString(freq(v)));
    }

    private static int[] freq(int[] v) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        int n = v.length;
        for (int i = 0; i < n; i++) {
            int index = v[i];
            if (maps.containsKey(index)) {
                int value = maps.get(index);
                ++value;
                maps.put(index, value);
            }
            else{

                maps.put(index, 1);
            }
        }
        int maxf = Integer.MIN_VALUE;
        int minf = Integer.MAX_VALUE;
        
        for (HashMap.Entry<Integer, Integer> entry : maps.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "," + value);
        }
        int[] res = new int[2];
        List<Integer> listkeys = new ArrayList<>(maps.keySet());
        System.out.println(listkeys);
        for(Integer key : listkeys){
            int value = maps.get(key);
            if(value>maxf){
                maxf = value;
                res[0] = key;
            }
            if(value<minf){
                minf = value;
                res[1] = key;
            }
        }
        return res;
    }
}
