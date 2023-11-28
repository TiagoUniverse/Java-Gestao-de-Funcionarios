public class Funcionario {

    // Atributos
    String Nome;

    String Cargo;

    Double Salario;

    int horasTrabalho;

    public Funcionario(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public void atribuirCargo(){

    }

    public void registrarHorasTrabalho(int horas){
        this.horasTrabalho += horas;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public void calcularSalario(Double salario, int horas, String nome){
        System.out.println("o salário é:"+ salario);
        System.out.println("As horas são: " + horas);
        if (salario != null) {
            double resultado = salario * horas;
            System.out.println("O salário total do funcionário " + nome + " é: " + resultado);
        } else {
            System.out.println("Por favor, preencha o salário deste funcionário primeiro.");
        }

    }


}
