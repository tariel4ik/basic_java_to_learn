package professions;

public class Security_Guards extends Human {
    public Security_Guards(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Охранник получил 11 тысяч");
    }
}
