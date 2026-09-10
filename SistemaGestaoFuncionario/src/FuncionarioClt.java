public class FuncionarioClt extends Funcionario implements SistemaInterno, TrabalhoRemoto {

    public FuncionarioClt(String nome, String cpf, String matricula, double remuneracao) {
        super(nome, cpf, matricula, remuneracao);
    }

    @Override
    public void calcularSalario() {
        double vr = 300.00;
        double vt = 150.00;
        setRemuneracao(getRemuneracao() + vr + vt);
    }


    @Override
    public String acesarSistema() {
        return getNome() + "Funcionário CLT acessou o sistema interno";
    }

    @Override
    public String trabalharRemoto() {
        return getNome() + "Funcionário CLT trabalhando remotamente";
    }
}
