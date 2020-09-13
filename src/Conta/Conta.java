package Conta;

public class Conta {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(638967);
        p1.setDono("Enzo Gabriel");
        p1.abrirConta("CP");
        p1.depositar(300);
        p1.sacar(200);
        p1.estadoAtual();


        ContaBanco p2 = new ContaBanco();
        p2.setDono("Alice");
        p2.abrirConta("CC");
        p2.setNumConta(923417);
        p2.depositar(1000);
        p2.estadoAtual();

    }
}





