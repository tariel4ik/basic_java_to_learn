package annonimous_classes;

public class Runner {
    public static void main(String[] args) {
        Alive dog = new Alive() {
            @Override
            public void eat() {
                System.out.println("Собака ест");
            }

            @Override
            public void breathe() {
                System.out.println("Собака дышит");
            }
        };
        dog.eat();
        dog.breathe();

        Animal cat = new Animal() {
            @Override
            public void eat() {
                System.out.println("Кошка ест");
            }
        };
        cat.eat();
    }
}
