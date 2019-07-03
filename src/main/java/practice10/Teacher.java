package practice10;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private List<Klass > klasses;

    public Teacher(int id, String name, int age, List<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public Teacher(int id, String name, int age) {
        this(id, name, age, new LinkedList<>());
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : this.klasses) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    public List<Klass> getClasses() {
        return klasses;
    }

    public String introduceWith(Student student) {
       if (isTeaching(student)) {
           return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
       }
       return super.introduce() + String.format(" I am a Teacher. I don't teach Jerry.");
    }

    @Override
    public String introduce() {
        if (this.klasses.isEmpty()) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        String klassNumberString = String.join(", ", this.klasses.stream().map(klass -> String.valueOf(klass.getNumber())).collect(Collectors.toList()));
        return super.introduce() + String.format(" I am a Teacher. I teach Class %s.", klassNumberString);
    }
}
