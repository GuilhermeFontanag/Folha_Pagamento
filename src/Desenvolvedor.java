public class Desenvolvedor extends Funcionario {


    public Desenvolvedor(String nome, String cpf, float saldo) {
        super(nome, cpf, saldo);
    }

    @Override
    public float calcularBonificacao() {
         return getSaldo()*(10/100);
    }
}
