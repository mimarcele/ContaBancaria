package Conta;

public class ContaBanco {
        //Atributos
        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;
        String cc = "cc";
        String cp = "cp";

        //Metodos
        public void estadoAtual() {
            System.out.println("=====================================================");
            System.out.println("Bem vindo a sua conta: " + this.getDono());
            System.out.println("Tipo da conta: " + this.getTipo());
            System.out.println("Número da conta: " + this.getNumConta());
            System.out.println("Saldo disponível para saque: " + this.getSaldo());
            System.out.println("Status da conta: " + this.getStatus() );
            System.out.println("======================================================");
        }

        public void abrirConta(String t){
            this.setTipo(t);
            this.setStatus(true);
            if (t.equals(cc.toUpperCase())) {
                this.setSaldo(50);
            } else if (t.equals(cc.toUpperCase())){
                this.setSaldo(150);
            }
            System.out.println("Conta aberta com sucesso!");
        }
        public void fecharConta(){
            if(this.getSaldo() > 0){
                System.out.println("Retire o dinheiro da sua conta para fechá-la");
            } else if(this.getSaldo() < 0){
                System.out.println("Conta não pode ser fechada pois está em débito");
            } else {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso!");
            }
        }
        public void depositar(float v){
            if (this.getStatus()){
                this.setSaldo(this.getSaldo() + v);
                System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("Impossível depositar em uma conta fechada.");
            }
        }
        public void sacar(float v){
            if (this.getStatus()) {
                if (this.getSaldo() >= v){
                    this.setSaldo(this.getSaldo()- v);
                    System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else {
                System.out.println("Impossível sacar com a conta inativa");
            }
        }
        public void pagarMensalidade(){
            int v = 0;
            if (this.getTipo().equals("CC")){
                v = 12;
            } else if (this.getTipo().equals("CP")){
                v = 20;
            }
            if (this.getStatus()) {
                this.setSaldo(this.getSaldo() -v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Não há mensalidade a ser paga");
            }
        }

        //Métodos Especiais

        public ContaBanco() { //metodo construtor
            this.setSaldo(0);
            this.setStatus(false);
        }

        public void setNumConta(int n){
            this.numConta = n;
        }
        public int getNumConta(){
            return this.numConta;
        }
        public void setTipo(String t){
            this.tipo = t;
        }

        public String getTipo(){
            return this.tipo;
        }
        public void setDono(String d){
            this.dono = d;
        }
        public String getDono(){
            return this.dono;
        }
        public void setSaldo(float s){
            this.saldo = s;
        }
        public float getSaldo(){
            return this.saldo;
        }
        public void setStatus(boolean a){
            this.status = a;
        }
        public boolean getStatus(){
            return this.status;
        }
    }


