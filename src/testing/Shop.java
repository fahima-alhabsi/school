package testing;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	
	
	private String shopName;
	private int shopId;
	
	
	
	List<Product> product = new ArrayList<Product>();
	
	
	
	
	
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	
	
	
	

}
