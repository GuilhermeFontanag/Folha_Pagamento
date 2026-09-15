public abstract class Funcionario {

    private String nome;
private String cpf;
private float saldo = 0;

public Funcionario(String nome, String cpf, float saldo){
    this.nome = nome;
    this.cpf = cpf;
    this.saldo = saldo;
}

public abstract float  calcularBonificacao();

public  float calcularRemuneracaoTotal(){
    this.saldo = saldo;
    float bonificacao = calcularBonificacao();

    float remuneracao = saldo + bonificacao;

    return remuneracao;
    }

    public String getNome(){
        return nome;
    }

    public float getHolerite() {
        return saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public float getSaldo() {
        return saldo;
    }
}



