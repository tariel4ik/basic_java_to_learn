package interface_inharitance;

public interface Eatings {
    default void eat(){
        System.out.println("Существо ест");
    }
}
