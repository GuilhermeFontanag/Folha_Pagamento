public  class Gerente extends Funcionario {
 //
    private float meta = 0;
    public boolean meta_true = false;
    float meta_aceita = 0;

    //metodo construtor
    public Gerente(String nome, String cpf, float saldo) {
        super(nome, cpf, saldo);
    }

public void definir_meta(float meta){

    this.meta = meta / getHolerite()/2;

        if (!meta_true) {
           meta_aceita = getHolerite()+getHolerite()*(20/100);

        }
}

    @Override
    public float calcularBonificacao() {
       return meta_aceita;

    }

























}
