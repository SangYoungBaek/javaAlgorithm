package careerthon;

public class Days0108_01 {
    //3진법 뒤집기
    public int solution(int n) {
        String num = "";
        while (n != 0) {
            num += n%3;
            n /= 3;
        }
        return Integer.parseInt(num, 3);
    }
}
