package exercicios1;

public class Funcionario {
    private String nome;
    private Double salarioBruto;
    private String cargo;
    private Double descontos;
    private Double beneficios;

    public Funcionario(
    		String nome, 
    		Double salarioBruto, 
    		String cargo, 
    		Double descontos, 
    		Double beneficios) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.cargo = cargo;
        this.descontos = descontos;
        this.beneficios = beneficios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getDescontos() {
        return descontos;
    }

    public void setDescontos(Double descontos) {
        this.descontos = descontos;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(Double beneficios) {
        this.beneficios = beneficios;
    }

    public double calcularSalarioLiquido() {
        return salarioBruto - descontos + beneficios;
    }
}
