package example;

public class Num11 {
    public boolean solution(int x) {
        boolean answer = true;
        String longNum = "" + x;

        int sumNum = 0;

        for(int i = 0; i < longNum.length(); i++){
           sumNum += Integer.parseInt(longNum.substring(i, i+1));
        }

        if(x % sumNum == 0){
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
