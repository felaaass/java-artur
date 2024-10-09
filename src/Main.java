import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static List<Produto> listaProduto = new ArrayList<>();

    public static void main(String[] args){
        int escolha = 0;


        while (escolha != 3) {
            System.out.println("voce quer: 1. adicionar novo produto 2. olhar os produtos na lista ou 3. sair");
            escolha = scan.nextInt();


        switch(escolha) {
            case 1:
                adicionarProduto();
                break;


            case 2:
                exibir();
                break;

            case 3:
                break;

        }
        }



    }

    public static void exibir() {


        for (Produto produto : listaProduto) {

            System.out.println(produto);

        }
    }

    public static void adicionarProduto() {

        System.out.println("qual o nome do produto ? ");
        String nome = scan.next();
        System.out.println("qual o preço do produto ? ");
        double preco = scan.nextDouble();
        System.out.println("qual a quantidade do produto ? ");
        int quantidade = scan.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        listaProduto.add(produto);

    }
}