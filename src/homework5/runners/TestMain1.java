package homework5.runners;

import homework5.core.GlobalCounter;
import homework5.core.random.Java7Random;
import homework5.core.random.Java8Random;
import homework5.dto.Student;
import homework5.suppliers.RandomStudentSupplier;
import homework5.core.random.FakeRandom;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class TestMain1 {
    public static void main(String[] args) {
        GlobalCounter counter = new GlobalCounter();

        Supplier<Student> supplier1 = new RandomStudentSupplier(counter, new Java7Random());
        Supplier<Student> supplier2 = new RandomStudentSupplier(counter, new Java8Random());

        System.out.println(supplier1.get());
        System.out.println(supplier2.get());
        System.out.println(supplier2.get());
        System.out.println(supplier2.get());
    }
}
