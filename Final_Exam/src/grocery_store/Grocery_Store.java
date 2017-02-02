package grocery_store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grocery_Store {

	static Scanner sc = new Scanner(System.in);

	List<Category> category;

	public Grocery_Store(){
		this.category = new ArrayList<>();
	}

	void addCategory(){
		System.out.print("Category name : ");
		String name = sc.nextLine();
		String nameCat = String.format("Category %d : %s",category.size()+1,name);
		this.category.add(new Category(nameCat,name));
		
	}

	void editCategory(){
		System.out.print("Which number of category : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("Input new category name : ");
		String name = sc.nextLine();
		String nameCat = String.format("Category %d : %s",num,name);
		this.category.get(num-1).name = nameCat;
	}

	void showCategory(){
		for(int i=0 ; i<category.size() ; i++){
			System.out.println(category.get(i).name);
		}
	}

	void chooseCategory(int num){
		Category ct = this.category.get(num-1);
		boolean running = true;
		while(running){
			System.out.print("(a)dd product , (s)how product , (m)ain menu : ");
			String command = sc.nextLine();
			switch(command){
			case "a":
				ct.addProduct();
				break;
			case "s":
				ct.showProduct();
				break;
			case "m":
				return;
			default:
				break;
			}
		}
	}

	void remove(){
		System.out.print("Which category number : ");
		int num = Integer.parseInt(sc.nextLine());
		this.category.remove(num-1);
	}

	public static void main(String args[]){
		Grocery_Store gs = new Grocery_Store();
		boolean running = true;
		while(running){
			System.out.print("(s)eller or (b)uyer : ");
			String option = sc.nextLine();
			switch(option){
			case "s":
				boolean running1 = true;
				while(running1){
					System.out.print("(a)dd category , (e)dit catagory name , (c)hoose category , (q)uit : ");
					String command = sc.nextLine();
					switch(command){
					case "a":
						gs.addCategory();
						gs.showCategory();
						break;
					case "e":
						gs.editCategory();
						gs.showCategory();
						break;
					case "c":
						System.out.print("Which category number : ");
						int num = Integer.parseInt(sc.nextLine());
						gs.chooseCategory(num);
						break;
					case "q":
						running1 = false;
						break;
					default:
						break;
					}
				}
				break;
			case "b":
				boolean progress = true;
				while (progress){
					System.out.print("(a)dd to cart , (s)how available , (c)art : ");
					String optionb = sc.nextLine();
					switch(optionb){
					case "a":
						break;
						
					case "s":
						for(int i = 0 ; i<gs.category.size() ; i++){
							System.out.printf("\nCategory %d : \n\n",i+1,gs.category.get(i).toString());
							for(int j = 0 ; j<gs.category.get(i).product.size() ; j++){
								System.out.printf("%s",gs.category.get(i).product.get(j).toString());
							}
						}
						break;
						
					case "c":
						break;
						
					default:
						break;
					}
				}
				break;
			default:
				break;
			}
		}
	}
}
