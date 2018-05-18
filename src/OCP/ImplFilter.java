package OCP;

import java.util.List;
import java.util.stream.Stream;

public class ImplFilter implements Filter<Product> {
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(spec::isSatisfied);
    }
}
