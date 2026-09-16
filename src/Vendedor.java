public class Vendedor extends Funcionario {
    public Vendedor(String nome, String cpf, double saldo) {
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
        return (getSaldo()*5/100)+vendas * getSaldo();
    }

    @Override
    public String getDados() {
        return super.getDados() + "total de vendas:" +  vendas * 0.05;
    }


}
