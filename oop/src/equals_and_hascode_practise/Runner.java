package equals_and_hascode_practise;

public class Runner {
    public static void main(String[] args) {
        User user1 = new User("tigra", "11111");
        User user2 = new User("tigra", "1111");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));




    }
}
