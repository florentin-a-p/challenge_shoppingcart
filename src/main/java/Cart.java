import java.util.HashMap;

public class Cart {
  private static HashMap<String, Integer> product;

  public Cart() {
    this.product = new HashMap<String, Integer>();
  }

  public void addProduct(String productName, int productQuantity) {
    if (product.get(productName) != null) {
      product.put(productName,product.get(productName)+productQuantity);
    } else {
      product.put(productName,productQuantity);
    }
  }

  public void deleteProduct(String productName) {
    product.remove(productName);
  }

  public void showCart() {
    for(int i=0;i<product.size();i++) {
      System.out.println(product.keySet().toArray()[i] + " (" + product.values().toArray()[i] + ")");
    }
  }
}
