public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Expression firstNumber = new Number(5);
        Expression secondNumber = new Number(2);
        Expression thirdNumber = new Number(3);

        // (5 + 2) - 3
        Expression add = new Add(firstNumber, secondNumber);
        Expression subtract = new Subtract(add, thirdNumber);

        System.out.println("Resultado: " + subtract.interpret());
    }
}