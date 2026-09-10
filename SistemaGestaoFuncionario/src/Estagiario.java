public class Estagiario extends Funcionario{

    public Estagiario(String nome, String cpf, String matricula, double remuneracao) {
        super(nome, cpf, matricula, remuneracao);
    }

    @Override
    public void calcularSalario() {
        double vt = 150.00;
        double vr = 250.00;
        setRemuneracao(getRemuneracao() + vt + vr);
    }
}
