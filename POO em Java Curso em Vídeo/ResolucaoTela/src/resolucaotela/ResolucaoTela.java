package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;



public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension dimensao = tela.getScreenSize();
        
        System.out.println("Sua tela esta com uma resolucao de: " + dimensao.width + "x" + dimensao.height);
        
    }
    
}
