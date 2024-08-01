package enumeratiion;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Country greece = Country.GREECE;
        Country argentina = Country.ARGENTINA;
        Country japan = Country.JAPAN;
//        System.out.println(greece.getName());
//        System.out.println(argentina.getName());
//        System.out.println(japan.getName());
        System.out.println(Arrays.toString(Country.values()));
        System.out.println(Country.valueOf("JAPAN").getPeopleCount());
    }
}
