package example;

import java.util.*;

public class Num39 {
    public int[] solution(int[] numbers) {
        Set<Integer> sumNum = new HashSet<>();

        for(int i =0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                sumNum.add(numbers[i] + numbers[j]);
            }
        }

        return sumNum.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
