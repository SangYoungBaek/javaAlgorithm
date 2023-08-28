package example;

public class Num23 {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt;
        for(int i = left; i <= right; i++){
            cnt = 0;
            for(int j = 1; j<=i; j++){
                if(i % j == 0) cnt++;
            }
            if(cnt % 2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }
}

//    int answer = 0;
//    int b = 0;
//        for (int i = left ; i <= right ; i++) {
//        if((int)Math.sqrt(i)*(int)Math.sqrt(i) == i ){
//            b += i;
//        } else answer += i;
//
//    }
//    answer -= b;
//        return answer;
