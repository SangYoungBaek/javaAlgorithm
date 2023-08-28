public class Week1Test {
    public static void main(String[] args) {
        int score = 85;
        char grade;
        grade = (score>90)?'A':'B';
        System.out.println(score+"점은 "+grade+"등급입니다.");

        int pencils =534;
        int students = 30;

        int pencilsPerStudent = pencils/students;
        int pencilsLeft = pencils%students;

        System.out.println(pencilsPerStudent);
        System.out.println(pencilsLeft);

        score = 85;
        String result = (!(score>90))? "가" : "나";
        System.out.println(result);

        int value = 489;
        System.out.println((value/100)*100);

        int input = 10;

        switch (input%2) {
            case 0:
                System.out.println("짝수입니다.");
                break;
            case 1:
                System.out.println("홀수입니다.");
                break;
        }
        System.out.println("--------------");
        for(int i=0;i<10;i++) {
            if(i==5) continue;
            if(i==7) break;
            System.out.println(i);
        }
    }
}
