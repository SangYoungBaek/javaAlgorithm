package example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {1,2,3,4,5,6};
        System.out.println(main.solution(arr));
    }
    public double solution(int[] arr) {
        double answer = 0;
        answer = Arrays.stream(arr).sum();
        return answer / arr.length;
    }
}


