package week03.HW;

import java.util.Scanner;

public class Calculator {

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation){
        this.operation = operation;
    }
    public double calculate (int firstNumber, int secondNumber) {
        double result = 0;

        result = operation.operate(firstNumber, secondNumber);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return result;
    };

}
