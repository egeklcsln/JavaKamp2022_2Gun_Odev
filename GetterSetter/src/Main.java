public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Masaüstü Bilgisayar");
        product.id=203213 ;
        product.setDescription("HP");
        product.setPrice(10000);
        product.setStockAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);


    }
}
