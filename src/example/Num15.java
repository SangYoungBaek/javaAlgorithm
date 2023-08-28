package example;

import java.util.ArrayList;
import java.util.Collections;

public class Num15 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> intList = new ArrayList<>();

        for(int num : arr){
            if(num%divisor == 0){
                if (!intList.contains(num)){
                    intList.add(num);
                }
            }
        }

        if(intList.size()==0)
            intList.add(-1);

        Collections.sort(intList);
        answer = intList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
        //return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray(); ㄷㄷ 한줄이면 되네;;
    }
}
