package ClassObject;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Тузик");
        Class<? extends Cat> catClass = cat.getClass();
        System.out.println(catClass.getName());
        System.out.println(catClass.toString());
    }
}
