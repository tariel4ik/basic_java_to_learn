package polimorfism.interfaces;

public interface Movebale {
    void move();
    default void back(){
        System.out.println("Возвращаемся назад");
    }
}
