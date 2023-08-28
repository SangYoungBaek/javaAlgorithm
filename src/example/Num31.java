package example;

public class Num31 {

    public static void main(String[] args) {
        Num31 a = new Num31();
        System.out.println(a.solution2("try hello world"));
    }
    public String solution(String s) {
        String answer = "";
        String[] stArr = s.split(" ");
        String a = "";
        char[] charArr = new char[0];
        for(int i = 0; i < stArr.length; i++){
             charArr = stArr[i].toCharArray();
        }
        for(int j = 0; j < charArr.length; j++){
            if(j%2 == 0) {
                charArr[j] = Character.toUpperCase(charArr[j]);
            } else {
                charArr[j] = Character.toLowerCase(charArr[j]);
            }
            if(j<stArr.length) {
               answer +=  new StringBuilder(new String(charArr)).toString() + " ";
            } else {
                answer +=  new StringBuilder(new String(charArr)).toString();
            }
        }
       

        return answer;
    }

    public String solution2(String s) {
        String answer = "";
        String[] stArr = s.split("");

        int idx = 0;
        for(int i=0; i< stArr.length; i++){
            if(stArr[i].equals(" ")){
                idx = 0;
            } else if(idx % 2 == 0) {
                stArr[i] = stArr[i].toUpperCase();
                idx++;
            } else if (idx % 2 != 0) {
                stArr[i] = stArr[i].toLowerCase();
                idx++;
            }
            answer += stArr[i];
        }

        return answer;
    }
    // 다른사람 코드
    public String solution3(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}
