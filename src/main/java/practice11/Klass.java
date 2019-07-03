package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;

    private Student leader;

    private List<Student> members = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public List<Student> getMembers() {
        return members;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return String.format("Class %d", this.number);
    }

    public void assignLeader(Student leader) {
        if (!this.members.contains(leader)) {
           System.out.println("It is not one of us.");
           return;
        }
        System.out.println(String.format("I am Tom. I know %s become Leader of %s.",leader.getName(), getDisplayName()));
        this.leader = leader;
    }

    public void appendMember(Student student) {
        System.out.println(String.format("I am Tom. I know %s has joined %s.",student.getName(), getDisplayName()));
        members.add(student);
    }

    public boolean isIn(Student student) {
        return this.members.contains(student);
    }
}
