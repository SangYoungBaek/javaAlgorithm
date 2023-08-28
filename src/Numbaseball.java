import java.util.Scanner;
import java.lang.Integer;

public class Numbaseball {
    public static void main(String[] args) {
        int numArr[] = new int[3];
        int inputArr[] = new int[3];
        int strike = 0;
        int ball = 0;
        int count = 1; //몇번만에 맞췄는지 담을 변수
        boolean numChk = false; //중복체크
        String inputNum = "";

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 9);
            for(int j = 0; j < i; j++) {
                if(numArr[j] == numArr[i]) {
                    i--;
                    break;
                }
            }
        }

        while (true){
            System.out.print(count+"번째 시도 : ");
            inputNum = sc.next();
            for(int i=0;i<inputArr.length;i++){
                if(numChk){
                    break;
                }
                inputArr[i] = Integer.parseInt(inputNum.substring(i, i+1));
                for(int j=0;j<i;j++){
                    if(inputArr[j] == inputArr[i]){
                        System.out.println("중복된 값을 입력했습니다.");
                        numChk = true;
                        i--;
                        break;
                    }
                }
            }

            for(int i=0;i< numArr.length;i++){
                for(int j=0;j< inputArr.length;j++){
                    if(numArr[i]==inputArr[j] && i == j){
                        strike++;
                    } else if (numArr[i] == inputArr[j] && i != j) {
                        ball++;
                    }
                }
            }
            if(!numChk){
                System.out.println(ball+"B"+strike +"S");
            }

            if(strike == 3){
                System.out.println(count+"번만에 맞히셨습니다.");
                System.out.println("게임을 종료합니다.");
                break;
            } else {
                strike = 0;
                ball = 0;
                count++;
                numChk = false;
            }
        }

    }
}
