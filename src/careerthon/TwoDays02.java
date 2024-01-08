package careerthon;

public class TwoDays02 {
    //서울에서 김서방 찾기
    public String solution(String[] seoul) {
        int answer = -1;
        int start = 0;
        int end = seoul.length - 1;

        while (start < end) {
            if(seoul[start].equals("Kim")){
                answer = start;
                break;
            }
            if(seoul[end].equals("Kim")){
                answer = end;
                break;
            }
            start++;
            end--;
        }
        return String.format("김서방은 %d에 있다", answer);
    }
}
