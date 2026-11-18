package productsalesapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void GetTotalProductsSold_WithValidData_ReturnsCorrectValue() {
        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };
        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Product product = new Product(products, sales);
        int expected = 153;
        int actual = product.GetTotalProductsSold();

        assertEquals(expected, actual);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };
        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Product product = new Product(products, sales);
        double expected = 17.0;
        double actual = product.GetAverageProductSold();

        assertEquals(expected, actual, 0.01);
    }
}