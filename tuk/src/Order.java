import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Order[customer=" + customer + ", products=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order ord = (Order) obj;
        if (!Objects.equals(customer, ord.customer)) {
            return false;
        }
        if (basket == ord.basket) {
            return true;
        }
        if (basket == null || ord.basket == null) {
            return false;
        }
        if (basket.length != ord.basket.length) {
            return false;
        }
        for (int i = 0; i < basket.length; i++) {
            Product basketItem = basket[i];
            Product basketItem1 = ord.basket[i];
            if (basketItem == null && basketItem1 == null) {
                continue;
            }
            if (basketItem == null || basketItem1 == null) {
                return false;
            }
            if (!basketItem.equals(basketItem1)) {
                return false;
            }
        }
        return true;
    }

}
