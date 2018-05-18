package OCP;

import java.util.List;

public class Ocp {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.MEDIUM);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);
        ImplFilter implFilter = new ImplFilter();

        implFilter.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(p.name + " is green"));

        implFilter.filter(products, new SizeSpecification(Size.LARGE))
                .forEach(p -> System.out.println(p.name + " is large"));

        implFilter.filter(products,
                new AndSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE)))
                .forEach(p -> System.out.println(p.name + " is large and blue"));
    }
}
