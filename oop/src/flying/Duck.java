package flying;

public class Duck implements Flying, Swimming {
    @Override
    public void fly() {
        System.out.println("Утка летит");

    }

    @Override
    public void swim() {
        System.out.println("Утка плавет");
    }
}
