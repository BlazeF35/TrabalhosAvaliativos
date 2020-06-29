package Exercicio7;

import java.util.Scanner;

public class main<OrdList> {
	public static int main(String[] args) {
	
		private int inserir(OrdList lista, int vida, double ataque){
		 if (lista == null)
		 {
		 System.out.print("Lista nao inicializada!\n\n");
		 return -1;
		 }
		 if (lista.count == 20)
		 {
		 System.out.print("Lista cheia! Impossivel inserir\n\n");
		 return -2;
		 }
		
		 int i;
		
		 for (i = (lista.count) - 1; lista.enemies[i].vida > vida && i >= 0; i--){
			 lista.enemies[i + 1].vida = lista.enemies[i].vida;
			 lista.enemies[i + 1].ataque = lista.enemies[i].ataque;
		 }
		 
		 i + 1 : lista.enemies[i + 1].vida = vida;
		 lista.enemies[i + 1].ataque = ataque;
		
		 lista.count++;
		 return 1;
		}

	}

}
