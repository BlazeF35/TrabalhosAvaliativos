package Exercício1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class Josephus {
	public static void main(String[] args) {
	
	int n; 
	int chapeu;
	int newchapeu; 
	int counter;
    
	ArrayList<Integer> lista = new ArrayList<Integer>();
    
	Scanner scan = new Scanner(System.in);

    System.out.println("Número de soldados: ");
    n = scan.nextInt();
    scan.nextLine();

    System.out.println("Contagem: ");
    chapeu = scan.nextInt();

    for (int count=1; count <= n; count++){
      Line.add(new Integer(count));
    }
    
    counter = chapeu - 1;
    newchapeu = chapeu;


    while (!(lista.isEmpty())){
       System.out.println("Faleceu: " + lista.remove(counter));
       n = n - 1;
       
       		if (n > 0){
       			counter = (counter + chapeu - 1) % n;
       		}else if(n == 1){
     	  System.out.println("Sobriviveu: " + lista.remove(counter));
       		}
    }
  }
}
    

