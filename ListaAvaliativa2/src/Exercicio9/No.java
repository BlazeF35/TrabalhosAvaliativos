package Exercicio9;

public class No {
	private No proximo;
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No node) {
        proximo = node;
    }

}
