package animals.oop.cats;

public class Тузик extends Cat {
    @Override
    public void liying() {
        System.out.println("Тузик гуляеет собака");

    }
    public Тузик(){
        super(12);
    }

    @Override
    public  void chew(){

    }

    @Override
    public void breath() {
        System.out.println("А тузик однако тоже дышит!");

    }
}
