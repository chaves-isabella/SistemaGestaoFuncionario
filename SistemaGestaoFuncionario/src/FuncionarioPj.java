public class FuncionarioPj extends Funcionario implements SistemaInterno, TrabalhoRemoto{

    public FuncionarioPj(String nome, String cpf, String matricula, double remuneracao) {
        super(nome, cpf, matricula, remuneracao);
    }

    @Override
    public void calcularSalario() {
        setRemuneracao(getRemuneracao());
    }


    @Override
    public String acesarSistema() {
        return getNome() + "Funcionário PJ acessando o sistema interno";
    }

    @Override
    public String trabalharRemoto() {
        return getNome() + "Funcionário PJ está trabalhando remotamente";
    }
}
