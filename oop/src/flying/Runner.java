package flying;

public  class Runner {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Plane plane = new Plane();
        Duck duck = new Duck();
//        duck.fly();
//        duck.swim();
//        plane.fly();
//        fish.swim();
        Swimming[] pool = {fish,duck};
        Flying[] sky = {duck,plane};
        for (Swimming swimming : pool) {
            swimming.swim();
            
        }
        for (Flying flying : sky) {
            flying.fly();

        }


    }

}
