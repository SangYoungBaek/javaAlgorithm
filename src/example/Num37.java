package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Num37 {
    public String[] solution(String[] arr, int n) {
        Map<String, String> map = new TreeMap<>();

        for(int i = 0; i < arr.length; i++){
            String plus = arr[i].substring(n, n + 1);
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }

            if(count < 2){
                map.put(arr[i], plus);
            }
        }

        ArrayList<String> strList = new ArrayList<>(map.keySet());
        Collections.sort(strList, (o1, o2) -> (map.get(o1).compareTo(map.get(o2))));
        String[] answer = strList.toArray(new String[0]);

        return answer;
    }
}
