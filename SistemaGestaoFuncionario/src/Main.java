void main() {

    FuncionarioClt novoClt = new FuncionarioClt("João", "11122233344", "12345", 2500.00);
    FuncionarioPj novoPj = new FuncionarioPj("Maria", "99988877766", "98765", 2300.00);
    Estagiario novoEstagiario = new Estagiario("José", "12345678910", "77777", 1700.00);
    Aprendiz novoAprendiz = new Aprendiz("Isabella", "55566677788", "22277", 8, 24);
    Consultor novoConsultor = new Consultor("Gabriel", "98765432122", "08102", 2);

    IO.println("---- Calculando salário CLT ----");
    IO.println("Nome: " + novoClt.getNome());
    IO.println("Matricula: " + novoClt.getMatricula());
    novoClt.calcularSalario();
    IO.println("Remuneração final: " + novoClt.getRemuneracao());
    IO.println("________________________________________________________");
    IO.println("---- Calculando salário PJ ----");
    IO.println("Nome: " + novoPj.getNome());
    IO.println("Matricula: " + novoPj.getMatricula());
    novoPj.calcularSalario();
    IO.println("Remuneração final: " + novoPj.getRemuneracao());
    IO.println("________________________________________________________");
    IO.println("---- Calculando salário Estagiário ----");
    IO.println("Nome: " + novoEstagiario.getNome());
    IO.println("Matricula: " + novoEstagiario.getMatricula());
    novoEstagiario.calcularSalario();
    IO.println("Remuneração final (bolsa auxílio): " + novoEstagiario.getRemuneracao());
    IO.println("________________________________________________________");
    IO.println("---- Calculando salário Aprendiz ----");
    IO.println("Nome: " + novoAprendiz.getNome());
    IO.println("Matricula: " + novoAprendiz.getMatricula());
    novoAprendiz.calcularSalario();
    IO.println("Remuneração final: " + novoAprendiz.getRemuneracao());
    IO.println("________________________________________________________");
    IO.println("---- Calculando salário Consultor ----");
    IO.println("Nome: " + novoConsultor.getNome());
    IO.println("Matricula: " + novoConsultor.getMatricula());
    novoConsultor.calcularSalario();
    IO.println("Remuneração final: " + novoConsultor.getRemuneracao());

}
