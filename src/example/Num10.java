package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Num10 {
    public long solution(long n) {
        long answer = 0;

        String longNum = "" + n;

        ArrayList<Integer> arrNum = new ArrayList<>();

        for(int i = 0; i < longNum.length(); i++){
            arrNum.add(Integer.parseInt(longNum.substring(i, i+1)));
        }

        arrNum.sort(Comparator.reverseOrder());
        longNum = "";
        for(int i = 0; i < arrNum.size(); i++){
            longNum += arrNum.get(i);
        }

        answer = Long.parseLong(longNum);
        return answer;
    }
}
