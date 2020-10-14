package practice09;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public Student getLeader() {
        return this.leader;
    }
}