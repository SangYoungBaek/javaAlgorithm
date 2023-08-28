package week02.collection;

import java.util.LinkedList;

public class Col2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(3);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.toString()); // 이렇듯 조회할 때는 arrayList보다 속도가 현저히 느리다

        linkedList.add(200);
        System.out.println(linkedList.toString()); // 이렇듯 추가할 때는 arrayList보다 속도가 빠르다

        linkedList.add(2, 4);
        System.out.println(linkedList.toString()); // 이렇듯 추가할 때는 arrayList보다 속도가 빠르다

        linkedList.remove(4);
        System.out.println(linkedList.toString());

        linkedList.set(1, 30);
        System.out.println(linkedList.toString());

        linkedList.clear();
        System.out.println(linkedList.toString());

    }
}
