package manual;

public class Runner {
    public static void main(String[] args) {
        Country argentina = CountriesGuide.ARGENTINA;
        System.out.println("Argentina");
        System.out.println(argentina.getCount_Peoples());
        System.out.println(argentina.getContinent());
        System.out.println(argentina.getLanguage());
        Country france = CountriesGuide.FRANCE;
        System.out.println("France");
        System.out.println(france.getLanguage());
        System.out.println(france.getContinent());
        System.out.println(france.getCount_Peoples());
        Country italy = CountriesGuide.ITALY;
        System.out.println("Italy");
        System.out.println(italy.getCount_Peoples());
        System.out.println(italy.getContinent());
        System.out.println(italy.getLanguage());
    }
}
