package pratice03.HW03;

public class Main {

    public static void main(String[] args) {
        Calulator cl = new Calulator(new AddOperation());
        double result = cl.calculate(4, 5);

        System.out.println(result);
        cl.setOperation(new DivideOperation());
        result = cl.calculate(20, 5);

        System.out.println(result);

        cl.setOperation(new MultiplyOperation());
        result = cl.calculate(23, 5);

        System.out.println(result);
    }
}
