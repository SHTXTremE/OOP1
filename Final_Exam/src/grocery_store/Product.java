package grocery_store;

public class Product {
	
	String name;
	int price;
	int amount;
	
	public Product(String name,int price,int amount){
		this.amount = amount;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString(){
		return String.format("%s (%d available) (%d baht)\n",name,amount,price);
	}
}

