package practice09;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return klass==null ?
                String.format("%s I am a Teacher. I teach No Class.", super.introduce()) :
                String.format("%s I am a Teacher. I teach Class %d.", super.introduce(), klass.getNumber());
    }

    public String introduceWith(Student student) {
        return this.klass==student.getKlass() ?
                String.format("%s I am a Teacher. I teach %s.",super.introduce(),student.getName()) :
                String.format("%s I am a Teacher. I don't teach %s.",super.introduce(),student.getName());
    }
}
