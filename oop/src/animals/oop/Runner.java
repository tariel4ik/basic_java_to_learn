package animals.oop;

import animals.oop.cats.EgyptCat;
import animals.oop.cats.Sfinx;
import animals.oop.cats.Тузик;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Инфо о Сфинксе");
        Sfinx sfinx = new Sfinx();
        sfinx.Miyau();
        sfinx.liying();
        sfinx.breath();
        System.out.println(sfinx.countTeath);

        System.out.println("Инфо о Египтянской Киське");
        EgyptCat egyptCat = new EgyptCat();
        egyptCat.Miyau();
        egyptCat.liying();
        egyptCat.breath();
        System.out.println(egyptCat.countTeath);
        egyptCat.chew();
        egyptCat.Eats();

        System.out.println("Инфо о Тузике");
        Тузик тузик = new Тузик();
        тузик.Miyau();
        тузик.breath();
        тузик.liying();
        System.out.println(тузик.countTeath);

    }
    
}
