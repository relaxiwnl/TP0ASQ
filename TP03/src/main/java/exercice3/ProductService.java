package exercice3;

public class ProductService {
    private ProductApiClient productApiClient;

    public ProductService(ProductApiClient productApiClient) {
        this.productApiClient = productApiClient;
    }

    public String getProduct(String productId) {
        // Appel de la méthode getProduct de ProductApiClient
        return productApiClient.getProduct(productId);
    }
}