import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private Cliente cliente;
    private List<ItemProdutos>listasItem;
  
    Pedidos(Cliente cliente){
        this.cliente=cliente;
        this.listasItem= new ArrayList<>();
        
    }

    public void adicionarItem(Produtos produto, int quantidades){
       if(quantidades>produto.getEstoque()){
        System.out.println("Estoque insuficiente");
       }
       ItemProdutos item=new ItemProdutos(produto, quantidades);
       listasItem.add(item);
    }

    public double calcularTotal(){
        double total=0;
        for(ItemProdutos item: listasItem){
            total +=item.calcularSubtotal();
        };
        return total;
    }
    public void finalizar(){
        for(ItemProdutos i: listasItem){
            i.getProduto().diminuirestoque(i.getQuantidade());
        }

    }

    public String toString(){
        return "Pedido do cliente: " + cliente;
    }
}
