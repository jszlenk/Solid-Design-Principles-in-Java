package OCP;

public class ColorSpecification implements Specification<Product>{
    private Color color;

    ColorSpecification(Color color) {
        this.color = color;
    }

    public boolean isSatisfied(Product p) {
        return p.color == color;
    }
}
