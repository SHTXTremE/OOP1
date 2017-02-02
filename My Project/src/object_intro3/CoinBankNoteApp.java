package object_intro3;

import java.util.Scanner;

public class CoinBankNoteApp {
	
	public static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args){
		Banknote banknote = new Banknote();
		Coin coin = new Coin();
		System.out.print("Input amount : ");
		int amount = input.nextInt();
		int remaining = amount;
		int bathArray[][] = {{1000,0},{500,0},{100,0},{50,0},{20,0},{10,0},{5,0},{2,0},{1,0}};
		
		for(int i=0 ; i<5 ; i++){
			banknote.setValue(bathArray[i][0]);
			bathArray[i][1] = remaining / banknote.getValue();
			remaining = remaining % bathArray[i][0];
			if(bathArray[i][1]!=0){
				System.out.printf("You get %d of %s\n",bathArray[i][1],banknote.toString());
			}
		}
		for(int i=5 ; i<9 ; i++){
			coin.setValue(bathArray[i][0]);
			bathArray[i][1] = remaining / coin.getValue();
			remaining = remaining % bathArray[i][0];
			if(bathArray[i][1]!=0){
				System.out.printf("You get %d of %s\n",bathArray[i][1],coin.toString());
			}
		}
	}
}
