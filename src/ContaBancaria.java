
public class ContaBancaria {
    private String nome;
    private float saldoAtual;
    private String tipoConta;

    public ContaBancaria(String nome, float saldoAtual, String tipoConta) {
        this.nome = nome;
        this.saldoAtual = saldoAtual;
        this.tipoConta = tipoConta;
    }
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getSaldoAtual() {

        return saldoAtual;
    }
    public void setSaldoAtual(float saldoAtual) {

        this.saldoAtual = saldoAtual;
    }
    public String getTipoConta() {

        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {

        this.tipoConta = tipoConta;
    }
}