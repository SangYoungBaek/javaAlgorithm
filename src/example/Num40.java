package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Num40 {
    public int[] solution(String s) {

        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            arrayList.add(s.substring(i, i+1));
        }

        int[] answer = new int[arrayList.size()];
        for(int i = 0; i < s.length(); i++){
            int count = Collections.frequency(arrayList, s.substring(i, i+1));
            if(count == 1){
                answer[i] = -1;
            } else {
                answer[i] = count;
            }
        }

        return answer;
    }

    public int[] solution2(String s) {

        int[] answer = new int[s.length()];

        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {

            if (!map.containsKey(s.charAt(i))) {
                answer[i] = -1;
                map.put(s.charAt(i), i);
            } else {

                answer[i] = i - map.get(s.charAt(i));
                map.put(s.charAt(i), i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Num40 a = new Num40();
        String s = "banana";
        a.solution(s);

    }
}
