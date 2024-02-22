import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
    @Test
    void addItemToCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(1, 9.99);
        assertEquals(1, cart.getItemsCount());
        assertEquals(9.99, cart.getTotalAmount(), 0.001);
    }

    @Test
    void addMultipleItemsToCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(2, 19.99);
        cart.addItem(1, 9.99);
        assertEquals(3, cart.getItemsCount());
        assertEquals(49.97, cart.getTotalAmount(), 0.001);
    }
}