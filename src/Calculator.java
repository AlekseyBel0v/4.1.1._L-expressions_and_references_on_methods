import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> davide = (x, y) -> {
        try {
            if (y == 0) {
                throw new ArithmeticException("Деление на ноль запрещено!");
            } else return x / y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return null;
        }
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x < 0 ? x = -x : x;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> printLn = System.out::println;
}
