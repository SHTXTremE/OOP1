package grocery_store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {

	static Scanner sc = new Scanner(System.in);

	List<Product> product;

	String name;
	String rawName;

	public Category(String name,String rawName){
		this.product = new ArrayList<>();
		this.name = name;
		this.rawName = rawName;
		
	}

	public void addProduct(){
		System.out.print("Product name : ");
		String name = sc.nextLine();
		String namePro = String.format("Product %d : %s",product.size()+1,name);
		System.out.print("Product price (baht) : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("Input Amount : ");
		int amount = Integer.parseInt(sc.nextLine());
		this.product.add(new Product(namePro,price,amount));
		showProduct();

	}

	public void showProduct(){
		System.out.println(this.name);
		for(int i=0;i<product.size();i++){
			System.out.printf("%s (%d available) (%d baht)\n",this.product.get(i).name,this.product.get(i).amount,this.product.get(i).price);
		}
	}
	
	@Override
	public String toString(){
		return this.rawName;
	}
}
