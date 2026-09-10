public class Aprendiz extends Funcionario{

    private int horasTrabalhadas;
    private int diasTrabalhados;

    public Aprendiz(String nome, String cpf, String matricula, int horasTrabalhadas, int diasTrabalhados) {
        super(nome, cpf, matricula, 0.0);
        this.horasTrabalhadas = 8;
        this.diasTrabalhados = diasTrabalhados;
        calcularSalario();
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
        double valorHora = 10;
        setRemuneracao(horasTrabalhadas * valorHora);
        setRemuneracao(getRemuneracao() * diasTrabalhados);
    }
}
