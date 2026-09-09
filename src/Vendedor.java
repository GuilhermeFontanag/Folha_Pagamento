public class Vendedor extends Funcionario {
    public Vendedor(String nome, String cpf, float saldo) {
        super(nome, cpf, saldo);
    }

    private float vendas=0;

    //objeto para colocar numero de vendas
    public void numero_vendas(float vendas) {
        if (vendas>=1) {
            this.vendas = vendas;
        }
    }

    @Override
    public float calcularBonificacao() {
        return (getHolerite()*5/100)+vendas * getHolerite();
    }



}
