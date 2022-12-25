package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		List<Shop> shopList =new ArrayList<Shop>();
		Product prod = new Product();
		Shop sho = new Shop();
		
		
		
		boolean sOption = true;
		while(sOption) {
		System.out.println("Enter Shop Name:");
		String sName = sc.next();
		sho.setShopName(sName);
		
		System.out.println("Enter Shop ID:");
		int sId = sc.nextInt();
		sho.setShopId(sId);
		
		
		shopList.add(sho); //array list name
		
		boolean option=true;
		while(option) {
		System.out.println("Enter Product Name:");
		String pName = sc.next();
		prod.setProductName(pName);
		
		System.out.println("Enter Product code:");
		int pId = sc.nextInt();
		prod.setProductCode(pId);
		
		sho.product.add(prod);
		
		System.out.println("Do you want to add new product? yes/no");
		String input = sc.next();
		if(input.equals("yes"))
		{
			option=true;
		}else if(input.equals("no"))
		{
			System.out.println("thank you");
			option = false;
		}
		}
		
		
		System.out.println("Do you want to add new shop? yes/no");
		String input = sc.next();
		if(input.equals("yes"))
		{
			sOption=true;
		}else if(input.equals("no"))
		{
			sOption=false;
			
			
			
			
		for(Shop s : shopList) {
	    System.out.println("Shop Name: " + s.getShopName());
		System.out.println("Shop ID: " + s.getShopId());
		for(Product p : s.getProduct()) {
		System.out.println("Product Name: " + p.getProductName());
		System.out.println("Product Code: " + p.getProductCode());
			}
			
			
			
		}
		}
		
		
		
		
		
		
	}

}}
