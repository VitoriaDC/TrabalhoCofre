package Uninter;

public class Euro extends Moeda { 
    public Euro(double valorInicial) { 
        this.valor = valorInicial; // Inicializa o valor da moeda
    }

    @Override
    public void info() {
        System.out.println("Euro - " + valor); // Exibe informações da moeda
    }

    @Override
    public double converter() {
        return this.valor * 6.10; // Converte o valor para reais
    }

    @Override 
    public boolean equals(Object objeto) { 
        if (this.getClass() != objeto.getClass()) {
            return false; // Verifica se o objeto é da mesma classe
        } 
        
        Euro objetoDeEuro = (Euro) objeto; 
        
        // Compara os valores das moedas
        return this.valor == objetoDeEuro.valor; 
    } 
}
