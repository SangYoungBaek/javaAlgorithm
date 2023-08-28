package week02.collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        // 선언 + 생성
        ArrayList<Integer> intList = new ArrayList<Integer>();

        //추가
        intList.add(99);
        intList.add(15);
        intList.add(3);

        //출력, 값가져오기
        System.out.println(intList.get(1));

        //변경
        intList.set(1, 10);
        System.out.println(intList.get(1));

        //삭제
        intList.remove(1);
        System.out.println(intList.get(1));

        System.out.println(intList.toString());
        //전체삭제
        intList.clear();
        System.out.println(intList.toString());
    }
}
