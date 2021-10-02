package ex44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product();
    @Test
    void getName() {
        product.setName("Cheese");
        assertEquals("Cheese",product.getName());
    }

    @Test
    void getPrice() {
        product.setPrice(10.00);
        assertEquals(10.00,product.getPrice());
    }

    @Test
    void getQuantity() {
        product.setQuantity(10);
        assertEquals(10,product.getQuantity());
    }
}