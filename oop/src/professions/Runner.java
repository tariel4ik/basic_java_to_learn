package professions;

public class Runner {
    public static void main(String[] args) {

        Security_Guards securityGuards = new Security_Guards(true);
        Secretary secretary = new Secretary(false);
        Accountant accountant = new Accountant(false);
        securityGuards.getSalary();
        secretary.getSalary();
        accountant.getSalary();
        accountant.DrinkCoffee();
        secretary.DrinkCoffee();
    }
}
