package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        // String 기능 활용하기

        String str = "ABCD";

// length()
        int strLength = str.length();
        System.out.println(strLength);  // 4 출력

// charAt(int index)
        char strChar = str.charAt(2); // 순번은 0부터 시작하니까 2순번은 3번째 문자를 가리킵니다.
        System.out.println(strChar);  // C 출력

// substring(int from, int to)
        String strSub = str.substring(0, 3); // 0~2순번까지 자르기 합니다. (3순번은 제외)
        System.out.println(strSub);  // ABC 출력

// equals(String str)
        String newStr = "ABCD";  // str 값과 같은 문자열 생성
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual); // true 출력

// toCharArray()
        char[] strCharArray = str.toCharArray(); // String 을 char[] 로 변환
        for(int i = 0;i<strCharArray.length;i++){
            System.out.println("toCharArray : "+strCharArray[i]);
        }

// 반대로 char[] 를 String로 변환하는 방법
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray); // char[] 를 String 으로 변환
    }
}
