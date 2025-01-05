package Uninter;

public class Dolar extends Moeda { 
    public Dolar(double valorInicial) { 
        this.valor = valorInicial; // Inicializa o valor da moeda
    }

    @Override
    public void info() {
        System.out.println("Dolar - " + valor); // Exibe informações da moeda
    }

    @Override
    public double converter() {
        return this.valor * 5.66; // Converte o valor para reais
    } 
    
    @Override 
    public boolean equals(Object objeto) { 
        if (this.getClass() != objeto.getClass()) {
            return false; // Verifica se o objeto é da mesma classe
        } 
        
        Dolar objetoDeDolar = (Dolar) objeto; 
        
        // Compara os valores das moedas
        return this.valor == objetoDeDolar.valor; 
    } 
}
