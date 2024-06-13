package apllication;

import implemetation.SupermarKetArray;
import implemetation.Supermarket;
import java.util.Scanner;

public class Program {
    private final static int SIZE = 3;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Supermarket supermarket = new SupermarKetArray(SIZE);
        int opcao;
        do{
            System.out.println("""
                    Lista de Compras:
                    1- Inserir
                    2- Listar
                    3- Remover
                    4- Sair
                    """);
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o item a ser inserido:");
                    String item = sc.next();
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    System.out.println("Digite o item da lista a ser removido:");
                    int index = sc.nextInt();
                    supermarket.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção Inválida. Por favor escolha novamente.");
            }
        }while (opcao!=4);
        sc.close();
    }

}
