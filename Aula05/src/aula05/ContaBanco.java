package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void statusAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
       }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t))
            this.setSaldo(50.0f);
        if ("CP".equals(t))
            this.setSaldo(150.0f);
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0)
            System.out.println("A conta possui dnheiro");
        else if (this.getSaldo() < 0)
            System.out.println("A conta possui debito");
        else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
            
        
        
    }
    
    public void depositar(float valor){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else{
            System.out.println("A conta nao esta aberta!");
        }
    }
    
    public void sacar (float valor){
        if (this.isStatus() && valor <= this.getSaldo()){
            this.setSaldo(this.getSaldo()- valor);
            System.out.println("Saque realizado na conta de " + this.getDono());
        } else {
            System.out.println("Ocorreu um problema, olhe seu saldo ou procure o gerente " + this.getDono());
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if("CC".equals(this.getTipo())){
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso" + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }
}
