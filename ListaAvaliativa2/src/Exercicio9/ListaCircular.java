package Exercicio9;

public class ListaCircular {
	private No no;
    private int contador;

    /** Creates a new instance of CircleList */
    public ListaCircular() {
       this.no = null;
        contador = 0;
    }

    public int quantDeNo() {
        return contador;
    }

    public No getNo() {
        return no;
    }

    public void proximoNo() {
        no = no.getProximo();
    }

    public void add(No node) {
        if (this.no == null) {
            node.setProximo(node);
            this.no = node;
        } else {
            node.setProximo(this.no.getProximo());
            this.no.setProximo(node);
        }
        contador++;
    }

}