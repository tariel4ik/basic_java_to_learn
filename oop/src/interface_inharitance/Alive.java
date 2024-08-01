package interface_inharitance;

public interface Alive extends Eatings, Moveabale{
    @Override
    default void eat() {
        Eatings.super.eat();
    }
}
