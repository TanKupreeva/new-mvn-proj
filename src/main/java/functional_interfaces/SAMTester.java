package functional_interfaces;

import java.util.Date;
import java.util.function.Function;

// sam - single abstract method interface
public class SAMTester {
    static int counter = 0;

    public static void main(String[] args) {
        Operable op = new Executor();
        op.operation(55, 55);
        //анонимный класс
        Operable op2 = new Operable() {
            @Override
            public void operation(int a, int b) {
                System.out.println(a - b);
            }
        };

        op2.operation(100, 20);


        //Lambda way
        Operable op3;
        op3 = (a, b) -> System.out.println(counter * b);
        op3.operation(77, 88);
        Printable pr1 = (str, times) -> {
            while (times > 0) {
                System.out.println(str);
                times--;
            }
        };
        pr1.print("hello lambda", 3);
        Calculation c = () -> 1l;
        Calculation c2 = () -> 2l;
        Calculation c3 = () -> {
            System.out.println(new Date());
            return 3L;
        };
        long value = c2.calc();
        System.out.println(value);
        test(c3);
        test(() -> 100L);
        Function<Double, Integer> function = (summ1) -> {
            return (int) (3.25 * summ1);
        };
        int result = function.apply(500000.00);
        System.out.println(result);
    }

    static void test(Calculation c) {
        System.out.println(c.calc() * 2);
    }
}

class Executor implements Operable {

    @Override
    public void operation(int a, int b) {
        System.out.println(a + b);
    }
}

@FunctionalInterface
interface Printable {
    void print(String s, int times);
}

@FunctionalInterface
interface Calculation {
    long calc();
}

interface Operable {
    double PI = 3.14;

    void operation(int a, int b);

    default void defaultOperation() {
        System.out.println(new Date());
    }

    static void staticOperation() {
        System.out.println("Inside static");
    }
}
