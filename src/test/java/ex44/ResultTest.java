package ex44;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void getProducts() {
        Result result = new Result();
        Product p = new Product();
        List<Product> products = new ArrayList<>();
        products.add(p);
        p.setName("Thing");
        p.setPrice(15.00);
        p.setQuantity(5);
        result.setProducts(products);
        assertEquals(products,result.getProducts());
    }
}