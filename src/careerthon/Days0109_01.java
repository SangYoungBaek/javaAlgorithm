package careerthon;

public class Days0109_01 {
    //부족한 금액 계산하기
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

        for(int i=1 ; i <= count; i++){
            sum += price * i;
        }

        if(sum - money > 0) {
            answer = sum - money;
        } else {
            answer = 0;
        }

        return answer;
    }
}
