package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        // 선언 + 생성
        Set<Integer> intSet = new HashSet<>();
        // 추가
        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for(Integer value: intSet) {
            System.out.println(value);
        }
        // 1 5 9 12


        intSet.remove(2);
        System.out.println(intSet);
        // contains -> 포함 확인
        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));
        // false
        // true
    }
}
