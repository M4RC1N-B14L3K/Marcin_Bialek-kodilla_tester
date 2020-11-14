public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light weight.");
        } else if (this.weight > 1000 && this.weight < 2000) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYear() {
        if (this.year < 2018) {
            System.out.println("This notebook is too old.");
        } else if (this.year < 2020) {
            System.out.println("This notebook is quite new.");
        } else {
            System.out.println("This notebook is brand new.");
        }
    }
}
