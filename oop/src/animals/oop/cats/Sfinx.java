package animals.oop.cats;

public class Sfinx extends Cat {

    @Override
    public void breath() {
        System.out.println("Сфинкс умеет дышать");

    }

    public Sfinx(){
        super(23);
    }

    @Override
    public void chew(){

    }
    @Override
    public void liying() {
        System.out.println("Лежит на боку");


    }
}

