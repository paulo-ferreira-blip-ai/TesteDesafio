import java.util.ArrayList;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int resposta;
        String digite;
        boolean c = true;


        ArrayList<Vendedor> vendedor = new ArrayList<>();
        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<Venda> vendas = new ArrayList<>();
        ArrayList<Produto> produto = new ArrayList<>();

        System.out.println("           ======CADASTRO=======");
        System.out.println("Faça o cadastro de 2 vendedores e 2 clientes: ");

        //Vendedores:
        Vendedor v1 = new Vendedor();
        System.out.println("Vendedor 1");
        v1.cadastrar();
        Vendedor v2 = new Vendedor();
        System.out.println("Vendedor 2");
        v2.cadastrar();

        vendedor.add(v1);
        vendedor.add(v2);


        //Clientes:
        Cliente c1 = new Cliente();
        System.out.println("Cliente 1");
        c1.cadastrar();
        Cliente c2 = new Cliente();
        System.out.println("Cliente 2");
        c2.cadastrar();

        cliente.add(c1);
        cliente.add(c2);


        //Produtos:
        Produto p1 = new Produto("Martelo");
        Produto p2 = new Produto("Alicate");
        Produto p3 = new Produto("Arame");
        Produto p4 = new Produto("Prego");
        produto.add(p1);
        produto.add(p2);
        produto.add(p3);
        produto.add(p4);

        //Vendas:
        Venda venda1 = new Venda();

        do {

            System.out.println("              ========MATERIÁIS DE CONSTRUÇÃO=========");
            System.out.println("Quem está efetuando esta venda?: ");
            System.out.println(vendedor);
            venda1.setVendedor(input.nextLine());
            System.out.println("Quem está efetuando esta compra?: ");
            System.out.println(cliente);
            venda1.setCliente(input.nextLine());
            System.out.println(produto);
            venda1.setProduto(input.next());
            System.out.println("Qual valor?: ");
            venda1.setValorProduto(input.nextDouble());
            System.out.println("Qual a data?: ");
            venda1.setDataDeRegistro(input.next());

            System.out.println("Venda realizada com sucesso!");

            System.out.println("Deseja fazer mais alguma venda? 1-sim 2- não ");
            resposta = input.nextInt();

        } while (resposta == 1);
        vendas.add(venda1);


        while (c == true) {
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Listar todas as vendas cadastradas.");
            System.out.println("2 - Listar todos os vendedores cadastrados.");
            System.out.println("3 - Listar todos os clientes cadastrados.");
            System.out.println("4 - sair.");

            resposta = input.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println(vendas);
                    break;
                case 2:
                    System.out.println(vendedor);
                    break;
                case 3:
                    System.out.println(cliente);
                    break;
                case 4:
                    c = false;
                    System.out.println("Obrigado por usar nosso sistema!");
                    break;

                default:
                    System.out.println("Ação inválida.");
            }
        }
    }
}
