public class User {
    public static void main(String[] args) {
        String[] user = new String[4];

        User anna = new User("Anna");
        User betty = new User("Betty");
        User carl = new User("Carl");
        User eva = new User("Eva");

        User[] users = {anna, betty, carl, eva};

        System.out.println(user);
        }
    }
}