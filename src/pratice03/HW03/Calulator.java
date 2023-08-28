package pratice03.HW03;

public class Calulator {

    private AbstractOperation operation;

    public Calulator(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation){
        this.operation = operation;
    }

    public double calculate (int firstNumber, int secondNumber) {
        double result = 0;
        result = operation.operate(firstNumber, secondNumber);
        return result;
    }
}
