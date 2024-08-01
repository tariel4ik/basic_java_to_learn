package hashcode;

import equals.Child;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Роман Ожигин", 12);
        Child child2 = new Child("Женька Масленкин", 8);
        Child child3 = new Child("Петя Скворцов", 8);
        Child child4 = new Child("Витя Абрамов", 12);

        Child[] group1 = {child1,child4};
        Child[] group2 = {child2, child3};
        Child[][] groups = {group1,group2};
        ChildrenGardensWithGroups childrenGardensWithGroups = new ChildrenGardensWithGroups(groups);

        Child childFind = new Child("Петя Скворцов",8);
        boolean result = false;
        for (Child child : childrenGardensWithGroups.getChildren()[childFind.hashCode()]) {
            if(child.equals(childFind)){
                result = true;
                break;
            }


            System.out.println(result);
        }


    }
}
