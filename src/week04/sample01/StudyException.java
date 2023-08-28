package week04.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();
        try {
            // 일단 실행
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e)  {
            System.out.println(e.getMessage());
        } finally {
            // 무조건 여기는 거쳐요!!!
            System.out.println("우리는 방금 예외를 handling 했습니다. 정상처리되든, 예외사항이 발생하든 여기를 거쳐요!!");
        }

    }
}
