package Uninter;

// Classe abstrata que representa uma moeda
public abstract class Moeda { 
    protected double valor; // Valor da moeda
    
    public abstract void info(); // Método para exibir informações da moeda
    public abstract double converter(); // Método para converter o valor da moeda
}
