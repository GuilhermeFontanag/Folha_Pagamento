public abstract class Funcionario {

    private String nome;
    private String cpf;
    private float saldo = 0;

    public Funcionario(String nome, String cpf, float saldo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("o nome do usuario nao pode estar vazio");
        }
        this.nome = nome.trim();
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("o cpf do usuario nao pode estar vazio");
        }
        this.cpf = cpf.trim();
        if (saldo < 0) {
            throw new IllegalArgumentException("o salario do usuario nao pode ser menor que 0");
        }
        this.saldo = saldo;
    }

    public abstract float calcularBonificacao();

    public float calcularRemuneracaoTotal() {

        float bonificacao = calcularBonificacao();

        float remuneracao = saldo + bonificacao;

        return remuneracao;
    }
//getters
    public String getNome() {
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

    public String getDados(){
        return String.format("nome:"+ nome + "%n cpf:" +  cpf + "%n salario:" + saldo);
    }

    //setters
    public void setSalario(double salario){
        if (saldo < 0) {
            throw new IllegalArgumentException("o salario do usuario nao pode ser menor que 0");
        }
        this.saldo = saldo;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("o cpf do usuario nao pode estar vazio");
        }
        this.cpf = cpf.trim();
    }

    public void setNome(String nome) {
            if (nome == null || nome.isBlank()) {
                throw new IllegalArgumentException("o nome do usuario nao pode estar vazio");
            }
            this.cpf = cpf.trim();
    }
}




