package enumeratiion;

public enum Country {
    JAPAN("JAPAN", 140_000_00l, "japanese "),
    GREECE("GREECE", 10_000_00l,"greece"),
    ARGENTINA("ARGENTINA", 47_000_00l, "spanish");
    private String name;
    private long peopleCount;
    private String language;

    Country(String name, long peopleCount, String language) {
        this.name = name;
        this.peopleCount = peopleCount;
        this.language = language;

    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", peopleCount=" + peopleCount +
                ", language='" + language + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public long getPeopleCount() {
        return peopleCount;
    }

    public String getLanguage() {
        return language;
    }
}
