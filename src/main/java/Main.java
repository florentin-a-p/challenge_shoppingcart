public class Main {
  public static void main(String[] args) {
    Cart keranjang = new Cart();
    keranjang.addProduct("Pisang Hijau", 2);

    keranjang.addProduct("Semangka Kuning", 3);

    keranjang.addProduct("Apel Merah", 1);
    keranjang.addProduct("Apel Merah", 4);
    keranjang.addProduct("Apel Merah", 2);

    keranjang.deleteProduct("Semangka Kuning");

    keranjang.deleteProduct("Semangka Merah");

    keranjang.showCart();
  }
}
