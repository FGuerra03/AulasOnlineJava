package aula11;

public final class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void RenovarBolsa(){
        System.out.println("Renovando bolsa do aluno " + this.getNome());
    }
    
    @Override
    public void PagarMensalidade(){
        System.out.println(this.getNome() + "eh bolsista, pagamento facilitado!");
    }
    
}
