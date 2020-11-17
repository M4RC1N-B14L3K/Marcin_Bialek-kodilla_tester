public class UserDate {
    public static void main(String[] args) {

        Uesr user = new User("Anna", 15 );
        System.out.println(user.name + "" + user.age);
        user.checkAge();

        User secondUser = new User("Dawid", 20);
        System.out.println(secondUser.name + "" + secondUser.age);
        user.checkAge();

        Notebook thirdUser = new User("Dominika", 30);
        System.out.println(thirdUser.name + "" + thirdUser.age);
        user.checkAge();
    }
}