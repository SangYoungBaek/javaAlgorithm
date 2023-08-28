package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 0, 5, 1};

        int min = arr[0];

        for(int num:arr){
            if(num < min){
                min = num;
            }
        }

        System.out.println("최소값은 => " + min);
    }
}
