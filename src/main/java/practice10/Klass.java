package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> member = new ArrayList<>();

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
        if(member.contains(leader)) {
            this.leader = leader;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }


    public void appendMember(Student member) {
        this.member.add(member);
    }
}