package practice08;

import java.util.Objects;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        return equals(this.klass.getLeader()) ?
                String.format("%s I am a Student. I am Leader of Class %d.",super.introduce(),klass.getNumber()) :
                String.format("%s I am a Student. I am at Class %d.",super.introduce(),klass.getNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(klass, student.klass);
    }
    
}

