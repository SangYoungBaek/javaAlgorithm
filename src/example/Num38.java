package example;

import java.util.ArrayList;
import java.util.Arrays;

public class Num38 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        //ArrayList<Integer> arrNum = new ArrayList<>();
        for(int i = 0; i < commands.length; i++){
            ArrayList<Integer> arrNum = new ArrayList<>();
            for(int j = commands[i][0]; j <= commands[i][1]; j++){
                arrNum.add(array[j-1]);
            }
            arrNum.sort(null);
            answer[i] = arrNum.get(commands[i][2]-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Num38 n = new Num38();

        int[] andswer = n.solution(array, commands);
        System.out.println(Arrays.toString(andswer));
    }
}
