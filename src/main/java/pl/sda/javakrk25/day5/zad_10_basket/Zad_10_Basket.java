package pl.sda.javakrk25.day5.zad_10_basket;

public class Zad_10_Basket {

    /**
     * Koszyk zakpów. Dodawanie przedmiotów do koszyka,
     * obliczanie ich wartości
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product("apples", 4.2);
        Product p2 = new Product("bananas", 2.12);
        Product p3 = new Product("oranges", 7.12);

        System.out.println(String.format("Wartość koszyka na początku: %.2f", cart.checkout()));
        cart.addProduct(p1, 3);
        System.out.println(String.format("Wartość koszyka po dodaniu p1: %.2f", cart.checkout()));
        cart.addProduct(p2, 2);
        cart.addProduct(p3, 1);
        System.out.println(String.format("Wartość koszyka na końcu: %.2f", cart.checkout()));
        cart.removeLast();
        System.out.println(String.format("Wartość koszyka na po usunięciu ostatniego: %.2f", cart.checkout()));
    }
}
