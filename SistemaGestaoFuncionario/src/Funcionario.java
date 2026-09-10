public abstract class Funcionario {

    private String nome;
    private String cpf;
    private String matricula;
    private double remuneracao;

    public Funcionario(String nome, String cpf, String matricula, double remuneracao) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.remuneracao = remuneracao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                ", remuneracao=" + remuneracao +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public abstract void calcularSalario();
}
