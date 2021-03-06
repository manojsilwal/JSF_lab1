package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@SessionScoped
public class ProductBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Product product;
	
	private ArrayList<Product> products = 
			new ArrayList<Product>(Arrays.asList(
					new Product("1","chips"),
					new Product("1","lays")
					));
	
	/*public ProductBean(){
		product = new Product();
	}*/
	

	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
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
		products.add(new Product(product.getProductId(),product.getName()));
		return "product";
	}
}

