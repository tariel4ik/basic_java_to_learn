package polimorfism.interfaces;

public class Car implements Movebale{
    public void move(){
        System.out.println("Машина едет");
    }

    @Override
    public void back() {
        Movebale.super.back();
        System.out.println("Машина возвращаеться назад");
    }
}
