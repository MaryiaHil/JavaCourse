package homework5.dto;

/**
 * Создать класс Student с полями
 * 	1.1 Порядковый номер (int)
 * 	1.2 Имя (Строка размером от 3 до 10 русских символов)
 * 	1.3 возраст (7-17)
 * 	1.4 оценка(0.0-10.0)
 * 	1.5 признак участия в олимпиадах (bool).
 */
public class Student implements Comparable<Student>{
    private final int id;
    private final String name;
    private final int age;
    private final double score;
    private final boolean isOlympiadParticipant;

    public Student(int id, String name, int age, double score, boolean isOlympiadParticipant) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.isOlympiadParticipant = isOlympiadParticipant;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public boolean isOlympiadParticipant() {
        return isOlympiadParticipant;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", isOlympiadParticipant=" + isOlympiadParticipant +
                '}';
    }
}
