package Uninter;

public class Real extends Moeda { 
    public Real(double valorInicial) { 
        this.valor = valorInicial; // Inicializa o valor da moeda
    }

    @Override
    public void info() {
        System.out.println("Real - " + valor); // Exibe informações da moeda
    }

    @Override
    public double converter() {
        return this.valor; // Retorna o valor da moeda em reais
    } 
    
    @Override 
    public boolean equals(Object objeto) { 
        if (this.getClass() != objeto.getClass()) {
            return false; // Verifica se o objeto é da mesma classe
        } 
        
        Real objetoDeReal = (Real) objeto; 
        
        // Compara os valores das moedas
        return this.valor == objetoDeReal.valor; 
    } 
}
