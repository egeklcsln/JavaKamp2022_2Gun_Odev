public class Main {

    public static void main(String[] args) {
 Product product = new Product();
 product.name="Masaüstü Bilgisayar";
 product.id=203213 ;
 product.description="HP";
 product.price=10000;
 product.stockAmount=5;

 ProductManager productManager = new ProductManager();
 productManager.Add(product);


    }
}
