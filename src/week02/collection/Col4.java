package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        //생성자가 없기 때문에 LinkedList를 사용
        Queue<Integer> intQueue = new LinkedList<>();

        //추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while (!intQueue.isEmpty()){
            System.out.println(intQueue.poll());
        }

        //다시 추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);
        intQueue.add(10);

        //peek
        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());
    }
}
