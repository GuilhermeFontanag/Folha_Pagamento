public  class Gerente extends Funcionario {
 //


    //metodo construtor
    public Gerente(String nome, String cpf, float saldo) {
        super(nome, cpf, saldo);
    }


    @Override
    public float calcularBonificacao() {
       return getSaldo()*(20/100);

    }

























}
