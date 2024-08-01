package equals;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Роман Ожигин", 12);
        Child child2 = new Child("Женька Масленкин", 8);
        Child child3 = new Child("Петя Скворцов", 8);
        Child child4 = new Child("Витя Абрамов", 10);

        Child[] children = {child1,child2,child3,child4};
        ChildGarden childGarden = new ChildGarden(children);

        boolean result = false;
        Child childFind = new Child("Женька Масленкин", 8);

        for (Child child : childGarden.getChildren()) {
            if(child.equals(childFind)){
                result = true;
                break;
            }
        }
        System.out.println(result);


    }
}
