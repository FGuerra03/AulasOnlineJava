package aula09;
public class Aula09 {
    public static void main(String[] args) {
        
        Pessoa [] p = new Pessoa [2];
        Livro [] l = new Livro [3];
        
        p[0] = new Pessoa("Felipe", 19, "masculino");
        p[1] = new Pessoa("Maria", 25, "feminino");
        
        l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avancado", "Maria Candido", 500, p[0]);
        
        l[2].folhear(250);
        System.out.println(l[2].detalhes());
        
    
        
    }
    
}
