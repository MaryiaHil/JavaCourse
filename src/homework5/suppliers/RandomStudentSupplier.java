package homework5.suppliers;

import homework5.core.GlobalCounter;
import homework5.dto.Student;
import homework5.core.api.IRandom;

import java.util.function.Supplier;

public class RandomStudentSupplier implements Supplier<Student> {
    private final IRandom rand;
    private final GlobalCounter counter;

    public RandomStudentSupplier(GlobalCounter counter, IRandom rand) {
        this.rand = rand;
        this.counter = counter;
    }


    @Override
    public Student get() {
        return new Student(
                counter.getAndInc(),
                rand.randString(3, 10),
                rand.randInt(7, 17),
                rand.randDouble(0, 10),
                rand.randBoolean()
        );
    }
}
