package exercice3;

public class ProductAPI implements ProductApiClient {
    @Override
    public String getProduct(String productId) {

        if (productId.equals("1")) {
        return "OK";

        } else {
            throw new IllegalArgumentException("Produit non trouvé");
        }
    }
}