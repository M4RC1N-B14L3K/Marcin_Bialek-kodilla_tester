public class Application {
    public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        public Person (String name, double age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User isolder than 30 and highter than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
