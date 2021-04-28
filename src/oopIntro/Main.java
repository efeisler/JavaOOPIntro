package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram",10) {};
		
		Product product2 = new Product(2,"Lenovo V15",14000,"8 GB Ram",10) {};
		
		Product product3=new Product(3,"Hp omen 15",10000,"asdas",10) {};
		
		Product[] products = {product1,product2,product3};
		
		ProductManager productManager= new ProductManager() {};
		
		productManager.addToCart(product1);

	}

}
