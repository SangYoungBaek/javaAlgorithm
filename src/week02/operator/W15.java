package week02.operator;

public class W15 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            System.out.println(i + " 번째 출력!");
        }


        int[] numbers = {3,6,9,12,15};
        for(int number: numbers) {
            System.out.print(number + " ");
        }

        for(int i = 0; i < numbers.length; i++) { // 배열에 .length 를 붙이면 길이값이 응답됩니다.
            System.out.println(numbers[i]);
        }
    }
}
