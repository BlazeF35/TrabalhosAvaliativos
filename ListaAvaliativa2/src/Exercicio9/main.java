package Exercicio9;

public class main {
	public static void main(String[] args) {
		
		ListaCircular circular = new ListaCircular();

        for (int i = 0; i < 15; i++) {
            No node = new No();
            node.setId(i);
            circular.add(node);
        }


        while (true) {
            System.out.println(circular.getNo().getId());
            circular.proximoNo();
        }

    }
}