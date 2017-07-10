package aula02;
public class Copo {
    int tamanho;
    float mls;
    String cor;
    boolean cheio;

    void status () {
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Volume: " + this.mls);
        System.out.println("Cor: " + this.cor);
        System.out.println("Esta cheio ? " + this.cheio);
}
    void encher(){
            if (this.cheio == true){
                System.out.println("Impossivel encher, ja esta cheia!");
            } else {
                System.out.println("Aproveite sua bebida senhor.");
            }
    }
    
    void beber(){
        this.cheio = false;
    }
    
    

}

