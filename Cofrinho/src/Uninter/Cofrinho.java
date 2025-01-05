package Uninter;

import java.util.ArrayList;

public class Cofrinho { 
    private ArrayList<Moeda> listaMoedas; // Lista para armazenar as moedas
    
    public Cofrinho() { 
        this.listaMoedas = new ArrayList<>(); // Inicializa a lista de moedas
    } 
    
    // Método para adicionar uma moeda ao cofre
    public void adicionar(Moeda moeda) { 
        this.listaMoedas.add(moeda); 
    } 
    
    // Método para remover uma moeda do cofre
    public boolean remover(Moeda moeda) { 
        return this.listaMoedas.remove(moeda); 
    }

    // Método para listar as moedas no cofre
    public void listagemMoedas() { 
        if (this.listaMoedas.isEmpty()) { 
            System.out.println("Não existe moedas no cofrinho!"); 
            return; 
        } 
        
        // Exibe as informações de cada moeda
        for (Moeda moeda : this.listaMoedas) { 
            moeda.info(); 
        }
    }

    // Método para calcular o total convertido para reais
    public double totalConvertido() {
        if (this.listaMoedas.isEmpty()) { 
            return 0; // Retorna 0 se não houver moedas
        }
        
        double valorAcumulado = 0; 
        
        // Converte o valor de cada moeda para reais e acumula
        for (Moeda moeda : this.listaMoedas) { 
            valorAcumulado += moeda.converter();
        } 
        
        return valorAcumulado; // Retorna o valor acumulado
    } 
}
