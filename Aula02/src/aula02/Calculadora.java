package aula02;
public class Calculadora {
    String modelo;
    int tamanho;
    int qtd_digitos;
    boolean ligada;
    
    void status (){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Quantidades de digitos: " + this.qtd_digitos);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Esta ligada ? "+ this.ligada);
    }
    
    void ligar(){
        this.ligada = true;
    }
    
    void desligar() {
        this.ligada = false;
    }
    
    void soma(int a, int b){
        if (this.ligada == false){
            System.out.println("Erro! Ligue a calculadora.");
        } else {
            System.out.println("A soma eh: ");
        }
    }
    
    void subtracao(int a, int b){
        System.out.println("A subtracao eh: ");
    }
    
    void multiplicacao(int a, int b){
        System.out.println("A multiplicacao eh: ");
    }
    
    void divisao(int a, int b){
        System.out.println("A divisao eh: ");
    }
    
}
