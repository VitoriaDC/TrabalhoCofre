package Uninter;

import java.util.Scanner;

public class Menu { 
    private Scanner sc; // Scanner para entrada de dados
    private Cofrinho cofrinho; // Instância de Cofrinho para gerenciar as moedas

    // Construtor da classe Menu
    public Menu() {
        sc = new Scanner(System.in); 
        cofrinho = new Cofrinho(); // Inicializa o cofre
    }

    // Método para exibir o menu principal
    public void exibirMenuPrincipal() { 
        System.out.println("COFRINHO");
        System.out.println("1. Adicionar moeda");
        System.out.println("2. Remover moeda");
        System.out.println("3. Listar moeda");
        System.out.println("4. Calcular total convertido para real");
        System.out.println("0. Encerrar"); 
        
        String opcaoSelecionada = sc.next(); // Captura a opção escolhida
        
        switch (opcaoSelecionada) { 
            case "0": 
                System.out.println("Finalizado!"); 
                return; // Sai do método se a opção for 0
            case "1": 
                exibirSubMenuAdicionarMoedas(); 
                exibirMenuPrincipal(); // Retorna ao menu principal
                break; 
            case "2": 
                exibirSubMenuRemoverMoedas();
                exibirMenuPrincipal(); // Retorna ao menu principal
                break;
            case "3": 
                cofrinho.listagemMoedas(); // Lista as moedas no cofre
                exibirMenuPrincipal(); // Retorna ao menu principal
                break; 
            case "4": 
                double valorTotalConvertido = cofrinho.totalConvertido(); // Calcula o total convertido
                String valorTotalConvertidoTextual = String.format("%.2f", valorTotalConvertido); 
                valorTotalConvertidoTextual = valorTotalConvertidoTextual.replace(".", ","); // Formatação para real
                System.out.println("O valor total convertido para real: " + valorTotalConvertidoTextual); 
                exibirMenuPrincipal(); // Retorna ao menu principal
                break; 
            default: 
                System.out.println("Esta opção é inválida!"); // Mensagem para opção inválida
        }

        // Chama novamente o menu principal
        exibirMenuPrincipal();
    }
    
    // Método para exibir o submenu de adição de moedas
    private void exibirSubMenuAdicionarMoedas() {
        System.out.println("Escolha Moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro"); 
        
        int opcaoMoeda = sc.nextInt(); // Captura a opção de moeda
        
        System.out.println("Digite o valor:"); 
        
        String valorTextualMoeda = sc.next(); 
        valorTextualMoeda = valorTextualMoeda.replace(",", "."); // Formatação do valor
        
        double valorMoeda = 0;
        try {
            valorMoeda = Double.parseDouble(valorTextualMoeda); // Tenta converter o valor
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido! Retornando ao menu.");
            return; // Retorna se o valor for inválido
        }
        
        Moeda moeda = null; 
        
        // Define a moeda com base na opção escolhida
        switch (opcaoMoeda) { 
            case 1: 
                moeda = new Real(valorMoeda);
                break;
            case 2: 
                moeda = new Dolar(valorMoeda); 
                break;
            case 3: 
                moeda = new Euro(valorMoeda); 
                break;
            default: 
                System.out.println("Não existe essa moeda!"); 
                return; // Retorna se a moeda for inválida
        }
        
        cofrinho.adicionar(moeda); // Adiciona a moeda ao cofre
        System.out.println("Moeda adicionada"); 
    }

    // Método para exibir o submenu de remoção de moedas
    private void exibirSubMenuRemoverMoedas() {
        System.out.println("Escolha Moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro"); 
        
        int opcaoMoeda = sc.nextInt(); // Captura a opção de moeda
        
        System.out.println("Digite o valor:"); 
        
        String valorTextualMoeda = sc.next(); 
        valorTextualMoeda = valorTextualMoeda.replace(",", "."); // Formatação do valor
        
        double valorMoeda = 0;
        try {
            valorMoeda = Double.parseDouble(valorTextualMoeda); // Tenta converter o valor
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido! Retornando ao menu.");
            return; // Retorna se o valor for inválido
        }
        
        Moeda moeda = null; 
        
        // Define a moeda com base na opção escolhida
        switch (opcaoMoeda) { 
            case 1: 
                moeda = new Real(valorMoeda);
                break;
            case 2: 
                moeda = new Dolar(valorMoeda); 
                break;
            case 3: 
                moeda = new Euro(valorMoeda); 
                break;
            default: 
                System.out.println("Não existe essa moeda!"); 
                return; // Retorna se a moeda for inválida
        } 
        
        // Tenta remover a moeda do cofre
        boolean removeuMoeda = cofrinho.remover(moeda); 
        if (removeuMoeda) {
            System.out.println("Moeda removida com sucesso!");
        } else { 
            System.out.println("Não foi encontrada nenhuma moeda com esse valor!"); 
        }
    }
}
