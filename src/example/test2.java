package example;

public class test2 {
    public void solution(int star) {
        // 코드 작성
        int cnt=0;
        for(int i = 0; i < star; i++){
            for(int j=0;j<i; j++){
                System.out.print(" ");
            }
            for (int x=i*2; x<(2*star)-1; x++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i<star-1; i++){
            for(int j=i+1; j < star-1; j++){
                System.out.print(" ");
            }
            for(int x=1; x<4+cnt; x++){
                System.out.print("*");
            }
            System.out.println();
            cnt += 2;
        }
    }

    public static void main(String[] args) {
        test2 method = new test2();
        int star = 7;
        method.solution(star);
    }
}
