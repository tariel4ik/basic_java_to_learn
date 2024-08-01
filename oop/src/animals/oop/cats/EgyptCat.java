package animals.oop.cats;

public class EgyptCat extends Cat {

    @Override
    public void liying() {
        System.out.println("Лежит на спине");

    }

    public EgyptCat(){
      super(28);

    }

    @Override
    public void chew() {
        super.chew();
        System.out.println("киська не простая, а золотая");
    }

    @Override
    public void breath() {
        System.out.println("Егигит тоже дышит");

    }
}
