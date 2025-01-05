package Uninter;

public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu(); // Cria uma instância do Menu
        menu.exibirMenuPrincipal(); // Exibe o menu principal

        // Exemplos de uso da classe Real
        Real umReal = new Real(1); 
        Real segundoUmReal = new Real(1); 
        Real terceiroUmReal = umReal; 
        
        // Verifica se os dois objetos de Real são iguais
        System.out.println(umReal.equals(segundoUmReal));  
    }
}
