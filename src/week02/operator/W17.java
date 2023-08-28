package week02.operator;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        //입력받은 단을 제외하고 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 단을 입력해주세요 : ");
        int num = sc.nextInt();

        // 구구단
        for(int i=2;i <=9;i++){
            if(i!=num){
                continue;
            }
            for(int j=1;j<=9;j++){
                System.out.println(i+" X "+j+" = "+i*j);
            }
        }
    }
}
