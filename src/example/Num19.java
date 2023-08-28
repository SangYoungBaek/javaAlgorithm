package example;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Num19 {
    public static void main(String[] args) {

        Num19 a = new Num19();
        //int[] x = [4,3,2,1];
        int y = 5;
        //int[] ab = a.solution(x);

        //System.out.println(ab);
    }

    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[] {-1};
        }

        IntStream intStream = Arrays.stream(arr);
        OptionalInt optionalInt = intStream.max();
        int min = optionalInt.getAsInt();
        for(int a : arr){
            if(min > a) {
                min = a;
            }
        }

        int[] answer = new int[arr.length-1];
        int index = 0;
        for(int a : arr){
            if(min != a) {
                answer[index++] = a;
            }
        }
        return answer;
    }


}
//  if (arr.length <= 1) return new int[]{ -1 };
//    int min = Arrays.stream(arr).min().getAsInt();
//      return Arrays.stream(arr).filter(i -> i != min).toArray();
