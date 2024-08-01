package equals;

public class Child {
    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return this.getAge() % 2;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if (obj instanceof Child child2) {
            return this.getName().equals(child2.getName()) && this.getAge() == child2.getAge();
        }
        return false;

    }
}
