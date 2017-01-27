package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@Named("productBean")
@SessionScoped
public class ProductBean implements Serializable{

	private static final long serialVersionUID = 1L;
	

	
	private String productId;
	
	private String name;
	
	
	private ArrayList<Product> products = 
			new ArrayList<Product>(Arrays.asList(
					new Product("1","chips"),
					new Product("1","lays")
					));
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	} 
	public String editProduct(Product product){
		product.setEdit(true);
		return null;
	}
	
	public String deleteProduct(Product product) {
		  products.remove(product);		
	      return null;
	   }
	
	public String saveProducts(){
		for(Product product: products){
			product.setEdit(false);
		}
		return null;
	}
	public String addProduct(){
		Product product = new Product(productId,name);
		products.add(product);
		return "product";
	}
}
