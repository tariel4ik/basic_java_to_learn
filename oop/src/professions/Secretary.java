package professions;

public class Secretary extends Office_Worker{
    public Secretary(boolean isWomen) {
        super(isWomen);
    }

    @Override
    public void getSalary() {
        System.out.println("Секретарь получил 45 тысяч");
    }
}
