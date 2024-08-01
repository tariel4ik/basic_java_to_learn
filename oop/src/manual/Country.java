package manual;

public class Country {
    private long count_Peoples;
    private String language;
    private String continent;

    public Country(long count_Peoples, String language, String continent) {
        this.count_Peoples = count_Peoples;
        this.language = language;
        this.continent = continent;
    }

    public long getCount_Peoples() {
        return count_Peoples;
    }

    public String getLanguage() {
        return language;
    }

    public String getContinent() {
        return continent;
    }
}
