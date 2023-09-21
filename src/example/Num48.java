package example;

public class Num48 {
    //소수 만들기
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int x = j+1; x < nums.length; x++){
                    int sum = nums[i] + nums[j] + nums[x];
                    if(isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int num){
        //i=1부터가 아닌 이유는 1은 나눌 필요 없는 수이므로
        //나누어 떨어지면 소수가 아니므로 false
        for(int i=2; i<num; i++){
            if(num%i==0)
                return false;
        }
        //나누어 떨어지지 않으면 true
        return true;
    }
}
