public class ItemProdutos {
    private int quantidade;
    private  Produtos produto;


public ItemProdutos(Produtos produto, int quantidade){
        this.produto=produto;
        this.quantidade=quantidade;
    }

    public double calcularSubtotal(){
        return produto.getPreco() *quantidade;
    }

    public Produtos getProduto(){
        return produto;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public String toString(){
        return " quantidade: " +quantidade+ " produtos " +produto;
    }
}
