public class Cargo {

    // Atributo
    String Nome;

    Double Salario_base;

    String Beneficios;


    public Cargo(String nome, Double salario_base, String beneficios) {
        Nome = nome;
        Salario_base = salario_base;
        Beneficios = beneficios;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getSalario_base() {
        return Salario_base;
    }

    public void setSalario_base(Double salario_base) {
        Salario_base = salario_base;
    }

    public String getBeneficios() {
        return Beneficios;
    }

    public void setBeneficios(String beneficios) {
        Beneficios = beneficios;
    }
}
