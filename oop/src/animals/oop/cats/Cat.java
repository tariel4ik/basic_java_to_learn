package animals.oop.cats;

import animals.oop.Alive;

public abstract class Cat extends Alive {

    public static final String MAIN_KUN = "MainKun";
    public int countTeath;

    public Cat(int countTeath) {
        this.countTeath = countTeath;
    }

    public final void Eats(){
        System.out.println("Он тоже может есть!");
    }
    public void Miyau() {
        System.out.println("Кошка мяукает");

    }

    public void chew(){
        System.out.println("Киська может поцарапать");
    }

    public abstract void liying();
}
