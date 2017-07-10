package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
        /*Caneta c2 = new Caneta();
        c2.modelo = "Hostenet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
        Calculadora c1 = new Calculadora();
        c1.modelo = "CASIO";
        c1.qtd_digitos = 15;
        c1.desligar();
        c1.soma(5, 10);
        
        Copo c1 = new Copo();
        c1.cor = "Preta.";
        c1.mls = 250;
        c1.tamanho = 15;
        
        c1.beber();
        c1.encher();*/
        
       
    }
    
}
