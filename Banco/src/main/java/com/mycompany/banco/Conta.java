package com.mycompany.banco;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("-----------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-----------------------------------------");
    }
    
    public Conta(int numConta, String tipo, String dono) {
        this.numConta=numConta;
        this.tipo=tipo;
        this.dono=dono;
        this.saldo=0;
        this.status=true;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("cc".equals(t)){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Impossivel fechar conta pois ainda tem dinheiro!");
        }else if(this.getSaldo()<0){
            System.out.println("Impossivel fechar conta pois ainda tem débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float valor){
        if(this.getStatus()==false){
            System.out.println("Impossivel depositar!");
        }else{
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        }
    }
    public void sacar(float valor){
        if(this.getStatus()==false){
            System.out.println("Conta inexistente!");
        }else{
            if(this.getSaldo()<valor){
                System.out.println("Saldo insuficiente!");
            }else{
                this.setSaldo(this.getSaldo()-valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
        }
    }
    public void pagarMensalidade(){
        float valor;
        
        if("cc".equals(this.getTipo())){
            valor=12;
        }else{
            valor=20;
        }
        if(this.getStatus()==true){
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else{
            System.out.println("Conta inexistente!");
        }
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    public String getTipo() {
        return this.tipo;
    }
    public String getDono() {
        return this.dono;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public boolean getStatus() {
        return this.status;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }
}
