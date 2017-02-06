package exercices.lifestores;

import java.util.ArrayList;
import java.util.List;

public class Distributor {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

}
