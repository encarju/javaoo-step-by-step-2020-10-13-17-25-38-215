package practice10;

public class Klass {
    private int number;
    private Student leader;
    private Student member;

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

    public void assignLeader(Student leader) {
        if(leader.getKlass().number == this.number) {
            this.leader = leader;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }


    public void appendMember(Student member) {
        this.member = member;
    }
}