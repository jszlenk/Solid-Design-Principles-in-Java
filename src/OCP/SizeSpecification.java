package OCP;

public class SizeSpecification  implements Specification<Product>{
    private Size size;

    SizeSpecification(Size size) {
        this.size = size;
    }

    public boolean isSatisfied(Product p) {
        return p.size == size;
    }
}
