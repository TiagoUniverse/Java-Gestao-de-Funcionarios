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

    public void calcularSalario(){

    }


}
