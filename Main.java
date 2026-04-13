import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produtos>lista=new ArrayList<>();
        Produtos produto = null;
        Pedidos pedido = null;
        Boolean continuar =true;

        do {
        System.out.println("===== BEM VINDO =====");
        System.out.println("0 - Cadastrar produto");
        System.out.println("1 - Listar produto");
        System.out.println("2 - Criar pedido");
        System.out.println("3 - Sair");

        int opcoes = sc.nextInt();
        sc.nextLine(); // limpa buffer

        switch (opcoes) {

            case 0:
                System.out.println("Digite o nome do produto:");
                String nomeDoProduto = sc.nextLine();

                System.out.println("Preço:");
                double preco = sc.nextDouble();

                System.out.println("Estoque:");
                int estoque = sc.nextInt();

                produto = new Produtos(nomeDoProduto, preco, estoque);

                lista.add(produto);
                System.out.println("Produto cadastrado com sucesso!");
                break;

                case 1:
                    if(lista.isEmpty()){
                        System.out.println("Sem Produtos Cadastrados");
                    }
                    System.out.println("======Lista de Produtos Cadastrados=========");
                    for (Produtos p:lista)
                    System.out.println(p);
                    break;
            case 2:

    if(lista.isEmpty()){
        System.out.println("Sem produto disponível por agora");
        break;
    }

    System.out.println("Digite seu nome:");
    String nome = sc.nextLine();

    System.out.println("Digite seu email:");
    String email = sc.nextLine();

    Cliente cliente = new Cliente(nome, email);
    pedido = new Pedidos(cliente);

    // LISTAR PRODUTOS
    System.out.println("Escolha um produto:");
    for (int i = 0; i < lista.size(); i++) {
        System.out.println(i + " - " + lista.get(i).getNome());
    }

    int indice = sc.nextInt();
    Produtos produtoEscolhido = lista.get(indice);

    System.out.println("Quantidade:");
    int quantidade = sc.nextInt();
           
if (produtoEscolhido.getEstoque() >= quantidade) {

    pedido.adicionarItem(produtoEscolhido, quantidade);
    pedido.finalizar();

    System.out.println("Total do pedido: R$ " + pedido.calcularTotal());
    System.out.println("Pedido criado com sucesso!");

} else {
    System.out.println("Estoque insuficiente!");
}
break;
case 3:
    continuar = false;
    break;

default:
                System.out.println("Opção inválida!");
        }
}

    while(continuar);

        sc.close();
    }
}