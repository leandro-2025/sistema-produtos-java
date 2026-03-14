package service;

import model.Produto;

import java.util.ArrayList;

public class ProdutoService {

    ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto p) {

        boolean existe = false;

        for (Produto produto : produtos) {
            if (produto.nome.equalsIgnoreCase(p.nome)) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("Já existe este produto cadastrado!");
        } else {
            produtos.add(p);
            System.out.println("Produto cadastrado com sucesso!");
        }
    }
    public void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        System.out.println("----- LISTA DE PRODUTOS -----");

        int i = 1;

        for (Produto p : produtos) {
            System.out.println(i + " - " + p.nome + " | R$: " + p.preco);
            i++;
        }

    }

    public void removerProduto(String nomeRemover) {

        boolean encontrado = false;

        for (Produto p : produtos) {
            if (p.nome.equalsIgnoreCase(nomeRemover)) {
                produtos.remove(p);
                System.out.println("Produto removido com sucesso!");

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado!");
        }
    }

    public void atualizarPreco(String nome, double novoPreco) {

        boolean encontrado = false;

        for (Produto p : produtos) {
            if(p.nome.equalsIgnoreCase(nome)) {

                p.preco = novoPreco;
                System.out.println("Preço atualizado com sucesso!");

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado!");
        }
    }
}
