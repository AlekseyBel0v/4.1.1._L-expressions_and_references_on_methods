public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        int a = calculator.plus.apply(1,2);
        int b = calculator.minus.apply(1,1);
        Integer c = calculator.davide.apply(a, b);
        // Старый код не работал, потомучто было допущено деление на 0.
        // Чтобы все работало, переменную сделал интежер. Переменную с вывожу, как нал.
        calculator.printLn.accept(c);
    }
}