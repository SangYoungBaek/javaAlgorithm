package example;

public class Num17 {
    public String solution(String phone_number) {
        String answer = "";
        String phoneMask = phone_number.substring(0, phone_number.length()-4);

        String masking = "";

        for(int i=0; i<phoneMask.length(); i++)
            masking += "*";

        answer = phone_number.replace(phoneMask, masking) + phone_number.substring(phone_number.length()-4, phone_number.length());

        return answer;

//        char[] ch = phone_number.toCharArray();
//        for(int i = 0; i < ch.length - 4; i ++){
//            ch[i] = '*';
//        }
//        return String.valueOf(ch);
    }
}
