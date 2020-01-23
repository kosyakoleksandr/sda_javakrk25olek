package pl.sda.javakrk25.day5.zad_10_basket;


public class ShoppingCart {

    private CartItem[] items = new CartItem[10];
    private int cartItemsCount = 0;

    /**
     * @param product produkt do dodania
     * @param count   ilość produktów do dodania
     */
    void addProduct(Product product, int count) {
        CartItem item = new CartItem(product, count);
        items[cartItemsCount] = item;
        cartItemsCount++;
    }

    /**
     * Usuwa ostatnio dodany element
     */
    void removeLast() {
        cartItemsCount--;
        items[cartItemsCount] = null;
    }

    /**
     * @return wartość wszystkich produktów w koszyku
     */
    double checkout() {
        double amount = 0;
        for (CartItem item : items) {
            if (item != null) {
                amount += item.getAmount();
            }
        }
        return amount;
    }

    private class CartItem {
        Product product;
        int count;

        public CartItem(Product product, int count) {
            this.product = product;
            this.count = count;
        }

        public Product getProduct() {
            return product;
        }

        public int getCount() {
            return count;
        }

        public double getAmount() {
            return count * product.getPrice();
        }
    }


}
