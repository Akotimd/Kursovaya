import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Product drell = new Product(1, "Дрель", 2500, "Инструменты");
        Product kreslo = new Product(2, "Кресло", 4000, "Мебель");
        Product kresloCopy = new Product(2, "Кресло", 4000, "Мебель");
        System.out.println(drell);
        System.out.println(drell.equals(kreslo));
        System.out.println(kresloCopy.equals(kreslo));
        System.out.println(Objects.equals(drell, kreslo));
        Order order = new Order("Иван", new Product[]{drell, kreslo});
        System.out.println(order);
        Order orderOne = new Order("Иван", new Product[]{drell, kreslo});
        Order orderTwo = new Order("Иван", new Product[]{drell});
        System.out.println(order.equals(orderOne));
        System.out.println(orderOne.equals(orderTwo));
    }
}