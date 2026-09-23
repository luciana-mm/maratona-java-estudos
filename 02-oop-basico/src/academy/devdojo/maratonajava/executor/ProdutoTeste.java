package academy.devdojo.maratonajava.executor;
import academy.devdojo.maratonajava.dominio.Produto;

import java.util.Scanner;
import java.util.ArrayList;

public class ProdutoTeste {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        System.out.println("======MENU======\n1-Cadastrar produto \n2-Listar produtos em estoque \n3-Editar produto \n4-Deletar produto \n0-Sair\n =");
        int opcao = scanner.nextInt();
        while (opcao != 0){
            switch (opcao){
                case 1:
                    System.out.println("Informe os dados a seguir: \n Nome do produto:");
                    String nome = scanner.nextLine();

                    System.out.println("Preço:");
                    float preco = scanner.nextFloat();

                    System.out.println("Quantidade:");
                    int quantiade = scanner.nextInt();

                    Produto produto = new Produto(nome,preco, quantiade);
                    produtos.add(produto);
                    ; break;
                case 2:
                    for (int i = 0; i < produtos.size(); i++) {
                        produto = produtos.get(i);
                        produto.listar();
                    }
                    ; break;
                case 3:
                    System.out.println("Informa o produto a ser editado:");
                    String nomeParaEdicao = scanner.next();
                    for (int i = 0; i < produtos.size(); i++) {
                        produto = produtos.get(i);
                        if (nomeParaEdicao.equals(produto.getNome())){
                            System.out.println("Nome do novo:");
                            String nomeNovo = scanner.nextLine();

                            System.out.println("Preço novo:");
                            float precoNovo = scanner.nextFloat();

                            System.out.println("Quantidade nova:");
                            int quantiadeNova = scanner.nextInt();

                            produto.setNome(nomeNovo);
                            produto.setPreco(precoNovo);
                            produto.setQuantidade(quantiadeNova);
                            break;
                        }
                    }
                    ;break;
                case 4:
                    System.out.println("Informa o produto a ser deletado:");
                    String nomeDeletado = scanner.nextLine();
                    for (int i = 0; i < produtos.size(); i++) {
                        produto = produtos.get(i);
                        if (nomeDeletado.equals(produto.getNome())){
                            produtos.remove(produto);
                            break;
                        }
                    }
                    ; break;
            }
            System.out.println("======MENU======\n1-Cadastrar produto \n2-Listar produtos em estoque \n3-Editar produto \n4-Deletar produto \n 0-Sair");
            opcao = scanner.nextInt();
        }

        System.out.println("Saindo do programa...");
    }
}
