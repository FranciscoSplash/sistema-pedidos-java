public class Produtos {
    private String nome;
    private double preco;
   private int estoque;

    Produtos(String nome,double preco,int  estoque){
        this.nome=nome;
        this.preco =preco;
        this.estoque=estoque;
        
        
    }

    public void diminuirestoque( int quantidade){
        if(quantidade>estoque){
            System.out.println("Sem estoque suficiente");
        }

        estoque -= quantidade;
        System.out.println(estoque);
    }

    public void aumentarestoque(int quantidade){
        estoque +=quantidade;
    
    }
    public void setEstoque(int estoque){
        this.estoque=estoque;
    }
    public double getPreco(){
        return preco;
    };
    public String getNome(){
        return nome;
    }
    public int getEstoque(){
        return estoque;
    }

       public String toString(){
         return "{nome='" + nome + "', preco=" + preco + ", estoque=" + estoque + "}";
    }
}
