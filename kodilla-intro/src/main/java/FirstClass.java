public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2018 );
        System.out.println(notebook.weight + "" + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println(heavyNotebook.weight + "" + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500,2013);
        System.out.println(oldNotebook.weight + "" + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
    }
}
