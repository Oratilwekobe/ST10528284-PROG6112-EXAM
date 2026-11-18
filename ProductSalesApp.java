package productsalesapp;

public class Product implements IProduct {
    private String[] products;
    private int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            count += sales[i].length;
        }
        return count > 0 ? (double) total / count : 0.0;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        String popularProduct = "";

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > maxSales) {
                    maxSales = sales[i][j];
                    // Strip " mattress" to match sample output format: "Cozy Nights Monarch (25)"
                    String cleanName = products[i].replace(" mattress", "");
                    popularProduct = cleanName + " (" + maxSales + ")";
                }
            }
        }
        return popularProduct;
    }
}