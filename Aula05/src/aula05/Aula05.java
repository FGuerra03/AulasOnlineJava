package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        
        p1.setDono("Jubileu");
        p1.setNumConta(001);
        p1.abrirConta("CC");
                
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(002);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p1.statusAtual();
        p2.statusAtual();
    }
    
}
