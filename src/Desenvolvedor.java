public class Desenvolvedor extends Funcionario {


    public Desenvolvedor(String nome, String cpf, double saldo) {
        super(nome, cpf, saldo);
    }

    @Override
    public float calcularBonificacao() {
         return getSaldo()*(10/100);
    }
}
