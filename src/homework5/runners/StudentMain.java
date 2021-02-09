package homework5.runners;

import homework5.comparators.StudentNameComparator;
import homework5.comparators.StudentScoreComparator;
import homework5.core.GlobalCounter;
import homework5.core.random.Java7Random;
import homework5.core.random.Java8Random;
import homework5.dto.Student;
import homework5.predicate.StudentAgeAndScorePredicate;
import homework5.suppliers.RandomStudentSupplier;
import homework5.utils.SortUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentMain {
    public static void main(String[] args) {
        Supplier<Student> supplier1 = new RandomStudentSupplier(new GlobalCounter(),
                new Java7Random());
        Supplier<Student> supplier2 = new RandomStudentSupplier(new GlobalCounter(), new Java8Random());

        Predicate<Student> predicate = new StudentAgeAndScorePredicate(12, 8);
        StudentNameComparator studentNameComparator = new StudentNameComparator();
        StudentScoreComparator studentScoreComparator = new StudentScoreComparator();

        // 4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Вывести топ 10
        flow(supplier1, predicate, studentNameComparator);

        // 5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Вывести топ 10
        flow(supplier2, predicate, studentScoreComparator.reversed());
    }

    public static void flow(Supplier<Student> supplier, Predicate<Student> predicate,
                            Comparator<Student> comparator) {
        //2. Создать 10_000 объектов класс Student и поместить в коллекцию. Данные заполняются рандомно.
        List<Student> data = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            data.add(supplier.get());
        }

        // 3. Отфильтровать студентов по нескольким признакам. По возрасту (тем кому 12 и выше), по оценке (выше 8).
        // Отфильтрованных студентов поместить в отдельный список. Старый список дожен остаться неизменным
        List<Student> filteredStudent = new ArrayList<>();

        for (Student value : data) {
            if (predicate.test(value)) {
                filteredStudent.add(value);
            }
        }

//        Iterator<Student> iter = data.iterator();
//        while (iter.hasNext()) {
//            Student val = iter.next();
//            if (val.getAge() >= 12 && val.getScore() > 8)
//                filteredStudent.add(val);
//        }

        SortUtils.shakerSort(filteredStudent, comparator);
        printTop10(filteredStudent);

    }

    public static void printTop10(List<Student> filteredStudents) {
        for (int i = 0; i < 10; i++) {
            System.out.println(filteredStudents.get(i));
        }
    }
}

