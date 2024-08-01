package professions;

public abstract class Office_Worker extends Human {
    public Office_Worker(boolean isWomen){
        super(isWomen);
    }

    public void DrinkCoffee(){
        System.out.println("Работник пьет кофе");
    }

}
