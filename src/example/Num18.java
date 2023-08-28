package example;

import java.util.stream.IntStream;

public class Num18 {
    public int solution(int[] numbers) {
        int answer = 0;
        int a[] = {0,1,2,3,4,5,6,7,8,9};

        for(int num : a){
            if(!IntStream.of(numbers).anyMatch(x -> x == num)) {
                answer += num;
            }

        }

        return answer;

//        int sum = 45;
//        for (int i : numbers) {
//            sum -= i;
//        }
//        return sum;
    }
}
