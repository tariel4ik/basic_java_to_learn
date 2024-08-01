package polimorfism.interfaces;

public class Runner {
    public static void main(String[] args) {
        Movebale car = new Car();
        Dog dog = new Dog();
//        car.move();
//        dog.move();

        Movebale[] movebales = new Movebale[2];
        movebales[0] = car;
        movebales[1] = dog;
        for(Movebale movebale: movebales){
            movebale.move();
            movebale.back();
        }


    }
}
