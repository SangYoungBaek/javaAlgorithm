package week02.array;

import java.util.Arrays;

public class Arr04 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length);
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
