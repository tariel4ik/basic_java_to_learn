package professions;

public class Accountant extends Office_Worker{
    public Accountant(boolean isWomen) {
        super(isWomen);
    }

    @Override
    public void getSalary() {
        System.out.println("Бухгалтер получил 32 тысячи");
    }
}
