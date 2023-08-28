package week02.collection;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        //선언 + 생성
        Stack<Integer> intStack = new Stack<Integer>();

        //값 넣기, 추가
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        //다 지워질 때 까지 출력
        //,isEmpty() : 변수가 비어있는지 체크해서 true, false 반환
        while (!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }

        //값 다시 넣기, 추가
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        //peak - 맨위 값 조회
        System.out.println(intStack.peek());
        System.out.println(intStack.size());
    }
}
