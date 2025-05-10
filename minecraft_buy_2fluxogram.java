package Testes;

import java.util.Scanner;

public class minecraft_buy_2fluxogram {
	
	public void Qmine() {
		System.out.println("Você tem Minecraft?");
		System.out.println("1. Sim");
		System.out.println("2. Não");
	}
	public void Qmoney() {
		System.out.println("\nTem dinheiro?");
		  System.out.println("1. Sim");
		  System.out.println("2. Não");
		  System.out.println("3. Não para isso");      
	}
	public void Qmoveis() {
		System.out.println("\nVocê tem móveis?");
	 	System.out.println("1. Sim");
		System.out.println("2. Não");
	}
	public void Qsoul() {
		 System.out.println("\nVocê tem alma?");
		  System.out.println("1. Sim");
		  System.out.println("2. Não"); 
	}
	public void SellS() {
		System.out.println("Venda ela\nCompre Minecraft!\nVá jogar!");
	}
	public void SellF() {
		System.out.println("\n2Venda-os\nCompre Minecraft!\nVá jogar!");
	}
	public void Play() {
		System.out.println("\nCompre Minecraft!\nE vá jogar!");
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		minecraft_buy_2fluxogram atalho = new minecraft_buy_2fluxogram();

		int mine, money, soul, furniture;

		atalho.Qmine();
		mine = stdin.nextInt();
		
		if (mine == 1) {
		System.out.println("\nVá jogar");
		} else if (mine == 2) {
			atalho.Qmoney();
		}
		
		money = stdin.nextInt();
		////
		
		if (money == 1) {
			atalho.Play();
		} else if (money == 2) {
			atalho.Qmoveis();
		} else if (money == 3) {
			System.out.println("\nBLASFÊMIA!");
			atalho.Play();
		}
		
		furniture = stdin.nextInt();
		////
		
		if (furniture == 1) {
			atalho.SellF();
		} else if (furniture == 2) {
			atalho.Qsoul();
		}
		soul = stdin.nextInt();
		////
		if (soul == 1) {
			atalho.SellS();
		} else if (soul == 2) {
			System.out.println("\nMENTIRA!\n");
			atalho.SellS();
		}
		
		
	}

}
