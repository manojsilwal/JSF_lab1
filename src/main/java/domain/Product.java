package domain;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public Product(){}
	
	public Product(String productId, String name) {
		this.productId = productId;
		this.name = name;
		this.edit = false;
	}
	private String productId;
	private boolean edit;
	private String name;
	
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
	public boolean isEdit() {
		return edit;
	}
	public void setEdit(boolean edit) {
		this.edit = edit;
	} 
	
}
