import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Product drell = new Product(1, "Дрель",2500, "Инструменты");
        Product Kreslo = new Product(2, "Кресло", 4000, "Мебель");
        Product Kreslo1 = new Product(2, "Кресло", 4000, "Мебель");
        System.out.println(drell);
        System.out.println(drell.equals(Kreslo));
        System.out.println(Kreslo1.equals(Kreslo));
        System.out.println(Objects.equals(drell, Kreslo));
        Order zakaz = new Order("Иван", new Product[]{drell, Kreslo});
        System.out.println(zakaz);
        Order zakaz1 = new Order("Иван", new Product[]{drell});
        Order zakaz2 = new Order("Иван", new Product[]{drell});
        System.out.println(zakaz.equals(zakaz1));
        System.out.println(zakaz1.equals(zakaz2));
    }
}