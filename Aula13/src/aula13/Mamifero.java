package aula13;
public class Mamifero extends Animal{
    protected String corPelo;

    @Override
    public void emitirSon() {
        System.out.println("Som de mamifero");
    }
    
}
