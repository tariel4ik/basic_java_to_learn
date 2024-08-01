package primitives_wrappers;

public class Runner {
    public static void main(String[] args) {
        String text = "11111";
        int number = Integer.parseInt(text);

        System.out.println(number * 10);
        Integer numberWrapper = 10;
        System.out.println(numberWrapper * 10);
    }
}
