public class Consultor extends Funcionario {

    private int numVendas;

    public Consultor(String nome, String cpf, String matricula, int numVendas) {
        super(nome, cpf, matricula, 0.0);
        this.numVendas = numVendas;
        calcularSalario();
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    @Override
    public void calcularSalario() {
        double vr = 300.00;
        double vt = 150.00;
        double bonus = 10.00;
        double salarioBase = 1500.00;
        double totalComissao = bonus * numVendas;
        setRemuneracao(salarioBase + vr + vt + totalComissao);
    }
}
