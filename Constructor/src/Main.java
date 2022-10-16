public class Main {

    public static void main(String[] args) {
        Product product = new Product(203213,"Masaüstü Bilgisayar","HP",10000,5);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);


    }
}
