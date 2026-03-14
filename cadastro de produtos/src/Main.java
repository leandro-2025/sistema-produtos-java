import model.Produto;
import service.ProdutoService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProdutoService service = new ProdutoService();

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n------ MENU ------");
            System.out.println("1 - Cadastrar produtos");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Atualizar preço");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {

                Produto p = new Produto();

                System.out.println("Digite o nome do produto:");
                scanner.nextLine();
                p.nome = scanner.nextLine();

                System.out.println("Digite o preço do produto:");
                p.preco = scanner.nextDouble();

                service.cadastrarProduto(p);

            } else if (opcao == 2) {

                service.listarProdutos();

            } else if (opcao == 3) {

                System.out.println("Digite o nome do produto que deseja remover:");
                scanner.nextLine();
                String nomeRemover = scanner.nextLine();

                service.removerProduto(nomeRemover);

            } else if (opcao == 4) {

                System.out.println("Digite o nome do produto que deseja atualizar:");
                scanner.nextLine();
                String nomeAtualizar = scanner.nextLine();

                System.out.println("Digite o novo preço:");
                double novoPreco = scanner.nextDouble();
                service.atualizarPreco(nomeAtualizar, novoPreco);

            } else if (opcao == 5) {

                System.out.println("Saindo do programa...");

            } else {

                System.out.println("Opção inválida!");

            }
        }

        scanner.close();
    }
}