package careerthon;

import java.util.*;


public class Days0105_02 {
    //할인 행사
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - days + 1; i++){
            Map<String, Integer> dcMap = new HashMap<>();

            for(int j = 0; j < days; j++){
                dcMap.put(discount[i + j], dcMap.getOrDefault(discount[i + j], 0) + 1);
            }

            Boolean isIdentical = true;

            for(String key : map.keySet()){
                if(map.get(key) != dcMap.get(key)) {
                    isIdentical = false;
                    break;
                }
            }

            answer += isIdentical ? 1 : 0;
        }
        return answer;
    }
}
