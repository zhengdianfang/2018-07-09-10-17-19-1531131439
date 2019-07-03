package practice11;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        this.klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (this.klass.getLeader() != null &&
                this.klass.getLeader().getId() == this.getId()) {
            return super.introduce() + String.format(" I am a Student. I am Leader of %s.", this.klass.getDisplayName());
        }
        return super.introduce() + String.format(" I am a Student. I am at %s.", this.klass.getDisplayName());
    }
}
