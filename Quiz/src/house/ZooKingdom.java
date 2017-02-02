package house;

import java.util.ArrayList;

import java.util.List;

class Zoo{
	public String zooName;
	
	public List<Animal> animals = new ArrayList<>();
	
	public Zoo(String zooName,int animalAmount){
		this.zooName = zooName;
		for(int i=0;i<animalAmount;i++){
			animals.add(new Animal("Name"+i));
		}
	}
	
	public int getAnimalAmount(){
		return this.animals.size();
	}
}

class Animal{
	public String name;
	public Animal(String name){
		this.name = name;
	}
}

public class ZooKingdom {
	public List<Zoo> zoos = new ArrayList<>();
	public static void main(String[]args){
		ZooKingdom zooKingdom = new ZooKingdom();
		zooKingdom.createZooKingdom();
		for(int i=0;i<zooKingdom.zoos.size();i++){
			System.out.println(zooKingdom.zoos.get(i).zooName+"have "+zooKingdom.zoos.get(i).getAnimalAmount());
		}
	}
	
	private void createZooKingdom(){
		for(int i=0;i<10;i++){
			this.zoos.add(new Zoo("MyZoo"+1,i));
		}
	}
}
