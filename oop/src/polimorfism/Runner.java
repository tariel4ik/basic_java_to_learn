package polimorfism;

public class Runner {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Animal[] animals = new Animal[2];
        animals[0] = dog;
        animals[1] = cat;

        feedTwoAnimals(dog, cat);

    }
    public static void feedTwoAnimals(Animal dog, Animal cat){
        dog.eat();
        cat.eat();
    }
}
